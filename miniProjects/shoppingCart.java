import java.util.Scanner;
public class shoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What would you like to buy : ");
        String item = sc.nextLine();

        System.out.print("What is the price for each? ");
        double price = sc.nextDouble();

        System.out.print("How many would you like to buy : ");
        int number = sc.nextInt();

        System.out.println("You have bought " + number + " " + item + "(s)");
        System.out.println("Your total is $" + price*number);

        sc.close();
    }
}
