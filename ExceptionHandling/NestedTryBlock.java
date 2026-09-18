public class NestedTryBlock {
    public static void main(String[] args) {
        try {
            
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Can't divide by zero.");
            }

            try {
                int[] arr = {1,2,3,4,5};
                for(int i = 0; i < 6; i++){
                    System.out.println(arr[i]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index does not exist.");
            }

            System.out.println("Something inside try.");

        } catch (Exception e) {
            System.out.println("Exception Handled.");
        }
        System.out.println("End...");
    }
}
