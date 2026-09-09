import java.util.Scanner;
public class ifElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if (age < 0){
            System.out.println("Invalid Age !!!");
        }
        else if (age >= 18){
            System.out.println("You are an adult !");
        }
        else{
            System.out.println("You are a child");
        }
        sc.close();
    }
}
