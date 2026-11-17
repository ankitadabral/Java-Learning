package oops.abstraction;

public abstract class Animal {// making this class as abstract class

    private int age;
    private String name;
    private String hasSuperpowers;


     abstract void sayHello(); // This is a abstract method

    // so this is abstraction Show the required functionality → Hide the internal implementation.
    // abstract void sayHello();
    //agr hmne abstract method ko public nhi bnaya to ye default treat hoga or package private ho jaega to ise koi package k bahar ki class access nhi kr paegi
    // and to access this in another package we need to make this method either public or protected so that the child class will inherit/ extend this particular class incase of accessing this method
    // protected - package private + child class (outside the pacakge as well)
    // and also if this abstract method is default only and we want to extend this class in another package then we have to make the child class abstract also


    // If we do not want to give defination/ add body/ implementation to any method and just want to declare the method then we should do it
    // by making that method abstract by adding 'abstract' word between access modifier and return type
    // But to make a abstract method in a class we must declare that class to be a abstract class otherwise we will not be able to create an abstract method
    // Abstract class can also have normal method i.e which have body/implementation and such methods are called as concrete method

    // Also we can make a abstract class that does not include any abstract method that is possible
    // but it is not possible to create a abstract method in a non abstract class
    // we can also declare normal variables and getter setter in this class. It is just like a normal class only except the one
    // abstract method
    // But we cannot directly create a object of abstract class it is not allowed it is because -
    //Because an abstract class is incomplete — it can have abstract methods that have no implementation.
   // Abstract parent → child ko saare abstract methods implement karne padte hain.
    // and if child doenot want to implement parent class abstract method then that child class needs to be abstract


    protected Animal(){  //We can make an abstract class constructor public, but it is usually not necessary.
        //The reason is that we cannot create an object of an abstract class directly. Its constructor is called when we create an object of its child class.
        //So, we usually use protected or default access for an abstract class constructor.

        this.hasSuperpowers = "false";
    }


    public static void sleep() {     // this is called a Concrete Method
        System.out.println("Zzzz.....");
    }

    public String getHasSuperpowers() {
        return hasSuperpowers;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



