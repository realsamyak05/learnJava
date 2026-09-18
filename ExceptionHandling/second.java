import java.io.IOException;

class abc{
    void msg(int n) throws IOException{
        if (n < 0) throw new IOException("Device Error");
        System.out.println("Throws Example");
    }
}

public class second{
    public static void main(String[] args) {
        abc obj = new abc();
        try {
            obj.msg(10);
        } 
        catch (IOException io) {
            System.out.println("Exception handled");
        }
        System.out.println("END");
    }
}