public class ThrowExcep2 {
    public static void main(String[] args){
        int[] a = new int[6];
        try{
            a[1] = 100;
            System.out.println(a[1]);
            a[10] = 50;
            System.out.println(a[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds.");
        }
    }
}
