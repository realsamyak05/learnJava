class ThreadExample extends Thread{
    public void run(){
        System.out.println("The thread is running.");
    }
}

public class TestThread {
    public static void main (String[] args){
        ThreadExample te = new ThreadExample();
        te.start();
    }
}
