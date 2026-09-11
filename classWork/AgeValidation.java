import java.util.Scanner;
public class AgeValidation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            ageCheck(age);            
    } 
        catch (InvalidAgeException e)  {
            System.out.println(e);
    }
        
    }

    static void ageCheck(int x) throws InvalidAgeException
    {
        if (x < 18){
            throw new InvalidAgeException("Age is invalid.");
        }
    }
}

class InvalidAgeException extends Exception //checked exception
{
    InvalidAgeException(String msg1)
    {
        super(msg1);
    }
}