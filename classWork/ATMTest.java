public class ATMTest {
    public static void main(String[] args) {
        double balance = 5000.0;
        double withdrawAmount = 7500.0;

        try
        {
        withdraw(balance, withdrawAmount);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Transaction attempt completed.");
        }
 
        // TODO: call withdraw() inside a try block,
        // catch InsufficientBalanceException,
        // and use finally to print "Transaction attempt completed."
    }
 
    static void withdraw(double balance, double amount) throws InsufficientBalanceException /* complete signature */ {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance.");
        }
        else{
            balance = balance - amount;
            System.out.println("Withdrawal Successful. New Balance: " + balance);

        }
        // TODO: throw InsufficientBalanceException if amount > balance
        // otherwise print "Withdrawal successful. New balance: " + (balance - amount)
    }
}

class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException(String msg) {
        super(msg);
    }
    
}
