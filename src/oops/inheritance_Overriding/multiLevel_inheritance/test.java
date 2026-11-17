package oops.inheritance_Overriding.multiLevel_inheritance;

public class test {
    public static void main(String[] args) {
        Child child = new Child(7, "Anki"); // creating child class object
        child.setName("Anki"); // setting name for child by using variable mentioned in grandparent class
        // and we are not directly inheriting grand parent class. we are extending parent class and parent class is extending grand parent class
        child.setAge(8);
        System.out.println(child.hasSuperPower);
        child.childMethod();//calling child method


        Parents parent = new Parents(45, "Anil"); // Creating object of parent class
        parent.setAge(35); // setting age for parent by using variable mentioned in grand parent class
        parent.setName("Anil");

        Grandparent grandparent = new Grandparent(78, "Sumitra"); // Creating object of grand parent class
        grandparent.setAge(87); // setting age for grand parent by sing variable mentioned in same class
        grandparent.setName("Sumitra");

        // This above scenario is called MULTI LEVEL INHERITANCE

        // Earlier when we are creating object of child and parent class then default constructor is getting called but as now we have defined 1 constructor in grandparent class,
        // and child and parent both are extending grandparent class then for both of them grand parent constructor will be called first.

        // now after creating constructor in every class for child class first grandparent constructor will be called
        // then parent contructor and then child constructor
        // same for parent class first grand parent constructor will be called nd then parent constructor will be called
        // constructor will be called hierarchy wise as per inheriting
    }
}