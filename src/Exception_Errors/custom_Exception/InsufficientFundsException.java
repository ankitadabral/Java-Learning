package Exception_Errors.custom_Exception;

// Creating a customised exception
public class InsufficientFundsException extends Exception{ // here extends word makes it a checked custom exception
// If we want we can add parametrized constructor or more fields in this

    private double amount;


    public InsufficientFundsException() {

        super("What do you want > You don't have money");
        // super keyword passes the message to the parent Exception class
        this.amount=amount;
    }

    public double getAmount() {
        return amount;
    }
}
