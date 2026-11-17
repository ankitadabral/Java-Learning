package InnerClasses;

// This Class is not neede IT is just to show the lengthy example we do without the annonymous inner class

public class CreditCard implements Payment{

    private String creditCardNumber;

    public CreditCard(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount );
    }
}
