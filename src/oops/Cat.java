package oops;

// INHERITANCE - One class inherits/extends some properties of another or parent class.
// Due to this we can achieve code reusability as by extending the animal class we can use the fields properties defined in that class
public class Cat extends Animal {
       String breed;

    public void sayHello() {
        System.out.println("Hello");
    }
}
