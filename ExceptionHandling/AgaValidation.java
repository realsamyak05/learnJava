import java.util.Scanner;
class InsufficientAgeException extends Exception{

    public InsufficientAgeException(String msg) {
        super(msg);
    }
    
}

public class AgaValidation {

    static void ageCheck(int age) throws InsufficientAgeException{
        if (age < 18){
            throw new InsufficientAgeException("Age must be 18 or above.");
        }
        else{
            System.out.println("You are eligible.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int n = sc.nextInt();
        try {
            ageCheck(n);
        } catch (InsufficientAgeException e) {
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
