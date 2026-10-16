class MyThrd extends Thread{
    @Override 
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
    }
}
public class LoopThread {
    public static void main(String[] args){
        MyThrd t1 = new MyThrd();
        MyThrd t2 = new MyThrd();

        t1.start();
        t2.start();

    }
}
