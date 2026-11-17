package oops.polymorphism;

import oops.inheritance_Overriding.inheritance.Animal;
import oops.inheritance_Overriding.inheritance.Cat;
import oops.inheritance_Overriding.inheritance.Dog;

public class runTime {
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.sayHello();

        Animal dog = new Dog();// here we are creating object of dog class but reference is of Animal class
        // and the above line is also called UPCASTING
        dog.sayHello();// Output will be "Woof" only from dog class also bject is being created of dog so jvm will go in dog class to find the method

        //AND ALSO Reference type (Animal) decide karta hai ki compiler kaunse methods/variables ko access karne dega. Object type (Dog) decide karta hai ki overridden method ka actual implementation runtime par kaunsa chalega.
        // and is case me object k pass vo method he hi nhi to nhi chlega
//NOTTE :Reference decides "kya access kar sakte ho", object decides "overridden method kaunsa chalega".

        Animal cat =new Cat(); // here we are creating object of cat class but reference is of Animal class
        cat.sayHello();// Output will be "Meow" only from cat class also object is being created of cat so jvm will go in cat class to find the method

        Dog mydog = (Dog) dog; //downcasting as dog is of animal class upper class
    }

}
// so as we can see above that it is deciding in runtime that which method should run dog or animal class

// METHOD OVERLOADING is COMPILE TIME POLYMORPHISM
// OR compile time polymorphism is achieved by method overloading


// METHOD OVERRIDING is RUN TIME POLYMORPHISM
// OR Run time polymorphism is achieved by method overriding and it is also called "DYNAMIC METHOD DISPATCH"

// 1. Upcasting ⬆️
//
//Child object ko Parent reference mein rakhna = Upcasting


//2. Downcasting ⬇️

 // Parent reference ko Child reference mein convert karna = Downcasting