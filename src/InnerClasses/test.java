package InnerClasses;

public class test {
    public static void main(String[] args) {

        // For MEMBER CLASS ENGINE
        Car car = new Car("Tata Safari");
        Car.Engine engine = car.new Engine(); // here we are creating object of member inner class using object of outer class
        // so that we can access the method present in it
        // and also here to access or create object of inner member class first we need to create object of outer class

        engine.start();
        engine.stop();


        // For MEMBER CLASS Operating System
        Computer computer = new Computer("HP", "ABC", "Linux");
        //Creates a Computer object.
        //computer is the reference variable.
        //"HP" → passed as brand.
        //"ABC" → passed as model.
        //"Linux" → passed as osName.
        //Inside the constructor, an OperatingSystem inner-class object is created.
        //That OS object is stored in the os variable of the Computer object.


        computer.getOs().displayInfo();
        //computer → Reference variable pointing to the Computer object.
        //.getOs() → Calls the getOs() method of the Computer class.
        //getOs() → Returns the OperatingSystem object stored in the private os variable.
        //. → Used to access a method/member of the returned object.
        //displayInfo() → Calls the displayInfo() method of the returned OperatingSystem object.

        // so above we have done the same work which we can do by below mwntioned line as well
        // Computer.OperatingSystem ops = computer.new OperatingSystem("Windows");
        // ops.displayInfo();
        // the difference here is that we are creating object of inner class here in main class
        // and above what we have done is that we have already written the code to create the object of inner class in outer class


        // FOR INNER CLASS USB
        Computer.USB usb = new Computer.USB("TYPE-C"); // here we are creating object of inner static class directly
        // Without creating the object of Outer class as the inner class USB is static and it is associated with the class and not with the instance/object
        usb.displayInfo(); // here we are calling method present inside the static class USB


        ShoppingCart shoppingCart = new ShoppingCart(150); // here we are creating object of Shopping cart class
        CreditCard creditCard = new CreditCard("86784030303030");// here we are creating object of that class which is implementing interface payement
        // whose instance we have passed in our shopping cart class method
        shoppingCart.processPayment(creditCard);// here we are accessing the processing payment method of shopping cart class and passing the creditcard class obhject reference
        // which further go to the credit card class and runs the implemented abstract method

        // To above method me what we are doing is we need to access method of interface so for that first we are creating a seperate class which is implemenrting interface
        // then we are creating object of that class and then using that instance in our class to use the method of interface
        //  so it is a lengthy process


        // FOR ANNONYMOUS INNER CLASS
        // Instead using above we can use ANONYMOUS INNER CLASS
        ShoppingCart shoppingCart2 = new ShoppingCart(200);
        shoppingCart.processPayment(new Payment() {   // so instead of creating a separate class we are directly using interface here
            // as anonymous class and overriding its method directly here
            @Override
            public void pay(double amount) {
                System.out.println("Paid " + amount + " Using Gpay");
            }
        });

        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid " + amount + " Using Paypal");

            }
        });


        // FOR LOCAL INNER CLASS Hotel
        Hotel hotel = new Hotel("Sunshine", 10, 5);
        hotel.reservedRoom("Ankita", 1);
        hotel.reservedRoom("Shubham", 5);
    }}




