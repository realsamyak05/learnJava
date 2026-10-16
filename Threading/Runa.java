class MyTask implements Runnable{
    @Override 
    public void run(){
        System.out.println("Thread in working.");
    }
}
public class Runa {
    public static void main(String[] args) {
        MyTask task1 = new MyTask();
        Thread t = new Thread(task1);
        t.start();
    }
}
