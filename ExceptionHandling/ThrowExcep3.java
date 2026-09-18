public class ThrowExcep3 {
    public static void main(String[] args) {
        String s = "abc";
        try {
            int n = Integer.parseInt(s);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("String is not a number.");
        }
    }
}
