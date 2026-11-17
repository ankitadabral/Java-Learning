package Exception_Errors.custom_Exception;

public class BankAccount {

    public double balance;

    public BankAccount(double amount){
        this.balance = amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount> balance){
         throw new InsufficientFundsException();// here we are giving the exception which we have created or customised
        }

        balance -= amount;

    }
}
