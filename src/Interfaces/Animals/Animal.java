package Interfaces.Animals;

public interface Animal {

    public static final int MAX_AGE = 150;// public static final is redundant here as it is by default that static constant is allowed here

    public abstract void eat();

    void sleep(); // by default public abstract hi hota he method so no need to explicitly write it
    //In an interface, if you declare a method without default, static, or private, it is implicitly public abstract.


    public static void info(){ // static method
        // We can directly access this method by using this interface name

        System.out.println("This is an animal interface");
    }

    default void run(int a, int b){   //default method and we can give parameter as well
        this.eat();  // we can use this also here as this points to current object and this default method is accessible through child class object
        System.out.println("Animal is running");
        System.out.println(a+b);
    }
}
