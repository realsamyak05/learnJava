class S extends Thread{
    @Override 
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Slee {
    public static void main(String[] args) throws InterruptedException{
        S t1 = new S();
        t1.start();
        t1.join();
        System.out.println("Finished");
        
    }
}
