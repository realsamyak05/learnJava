public class ThrowExcep1 {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero.");
        }
    }
}
