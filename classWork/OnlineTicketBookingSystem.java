import java.util.ArrayList;

class TicketBooking {
    private ArrayList<Integer> tics;

    TicketBooking() {
        tics = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            tics.add(i);
        }
    }

    public synchronized void bookTicket(String customer){
        if (tics.size() > 0){
            int tic = tics.remove(0);
            System.out.println(customer + " booked ticket " + tic);
        }
        else{
            System.out.println(customer + " could not book a ticker.");
        }
    }    
}

class BookingCounter implements Runnable {

    private TicketBooking booking;
    private String customer;

    BookingCounter(TicketBooking booking, String customer) {
        this.booking = booking;
        this.customer = customer;
    }

    @Override
    public void run() {
        booking.bookTicket(customer);
    }
}

public class OnlineTicketBookingSystem {
    public static void main(String[] args)
            throws InterruptedException {
        TicketBooking booking = new TicketBooking();
        Thread t1 = new Thread(
            new BookingCounter(booking, "Customer 1"));
        Thread t2 = new Thread(
            new BookingCounter(booking, "Customer 2"));
        Thread t3 = new Thread(
            new BookingCounter(booking, "Customer 3"));
        Thread t4 = new Thread(
            new BookingCounter(booking, "Customer 4"));
        Thread t5 = new Thread(
            new BookingCounter(booking, "Customer 5"));
        Thread t6 = new Thread(
            new BookingCounter(booking, "Customer 6"));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
    }
}