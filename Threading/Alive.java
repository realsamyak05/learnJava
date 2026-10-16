class M extends Thread{
    @Override 
    public void run(){
        System.out.println("Running");
    }
}
public class Alive {
    public static void main(String[] args) throws InterruptedException {
        M t1 = new M();
        System.out.println(t1.isAlive());
        t1.start();
        // t1.join();
        System.out.println(t1.isAlive());
    }
}
