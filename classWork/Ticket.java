class TicketCounter implements Runnable{
    int availableTickets = 3;
    synchronized void bookTicket(){
        if (availableTickets > 0){
            System.out.println("Ticket Number " + availableTickets + " sold to " + Thread.currentThread().getName());
            availableTickets--;
        }
        else{
            System.out.println("No ticket available.");
        }
    }

    @Override 
    public void run(){
        bookTicket();
    }
}

public class Ticket {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

        Thread t1 = new Thread(counter, "Counter-1");
        Thread t2 = new Thread(counter, "Counter-2");


        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
