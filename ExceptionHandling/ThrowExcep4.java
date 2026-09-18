public class ThrowExcep4 {
    public static void main(String[] args) {
        String s = null;
        try {
            int n = s.length();
        } catch (NullPointerException e) {
            System.out.println("String is null.");
        }
    }
}
