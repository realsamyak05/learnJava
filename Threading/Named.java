class MyThred extends Thread{
    

    MyThred(String Name) {
        super(Name);
    }
    @Override 
    public void run(){
    System.out.println(Thread.currentThread().getName() + " +is running.");
    }
}

public class Named {
    public static void main(String[] args){
        MyThred t1 = new MyThred("thread 1");
        MyThred t2 = new MyThred("thread 2");
        MyThred t3 = new MyThred("thread 3");


        t1.start();
        t2.start();
        t3.start();


    }    
}
