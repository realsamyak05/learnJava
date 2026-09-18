public class Exception222{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        try {
            for(int i = 0; i < 6; i++){
                System.out.println(arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ohh no, index out of bounds.");
        }

        String s = "abc";
        try {
            int n = Integer.parseInt(s);
        }
        catch (NumberFormatException e) {
            System.out.println("String is not a number");
        }
    }
}