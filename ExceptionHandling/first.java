public class first {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cant divide by 0.");
        }
        finally{
            System.out.println("I am done !!");
        }
    }
}
