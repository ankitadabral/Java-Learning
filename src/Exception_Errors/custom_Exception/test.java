package Exception_Errors.custom_Exception;

public class test {
    public static void main(String[] args) {
        BankAccount bankaccount = new BankAccount(10);
        try {
            bankaccount.withdraw(11);
        } catch (InsufficientFundsException e) {
            System.out.println(e);
        }

    }
}
