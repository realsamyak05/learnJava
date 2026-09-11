public class Car {
    String company = "Ford";
    String model = "Mustang";
    int year = 2026;
    double price = 1000000;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("Engine Started");
    }

    void stop(){
        isRunning = false;
        System.out.println("Engine Stopped");
    }

    public static void main(String[] args) {
        Car a = new Car();

        a.isRunning = true;
        
        System.out.println(a);
        System.out.println(a.model);
        System.out.println(a.company);
        System.out.println(a.year);
        System.out.println(a.price);
        System.out.println(a.isRunning);

        a.start();
        a.stop();
    }
}


