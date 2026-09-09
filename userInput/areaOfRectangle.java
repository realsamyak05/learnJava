import java.util.Scanner;
public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle : ");
        double l = sc.nextDouble();
        System.err.print("Enter breadth of rectangle : ");
        double b = sc.nextDouble();

        double area = l * b;
        System.out.println("Area of rectangle is : " + area);
        sc.close();
    }
}
