public class ThrowBack {
    public static void sqroot(int n){
        if (n < 0){
            throw new ArithmeticException("Negative number is not allowed.");
        }
        else {
            System.out.println("Square Root = " + Math.sqrt(n));
        }
    }

    public static void main(String[] args) {
        try {
            sqroot(-5);
        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally{
            System.out.println("End...");
        }
    }
}
