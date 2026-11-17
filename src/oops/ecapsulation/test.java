package oops.ecapsulation;

public class test {
    public static void main(String[] args) {

        // for student class
        student std = new student();
        std.setName("Ankita");
        std.setAge(25);
        std.setRollNumber(5);
        System.out.println(std.getAge());
        System.out.println(std.getRollNumber());
        System.out.println(std.getName());


        // for bankAccount class
        bankAccount bank = new bankAccount();
        bank.setAccountNumber(55555);
        bank.deposit(50);
        bank.withdraw(100);
        bank.deposit(400);
        bank.withdraw(300);
        System.out.println(bank.getBalance());

    }
}
