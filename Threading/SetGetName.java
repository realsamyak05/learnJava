class My extends Thread{
    @Override 
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is working.");
    }
}
public class SetGetName {
    public static void main(String[] args) {
        My t1 = new My();
        My t2 = new My();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        


    }
}
