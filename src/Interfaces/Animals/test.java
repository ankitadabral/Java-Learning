package Interfaces.Animals;

public class test {
    public static void main(String[] args) {

        Dog dog  = new Dog();
        dog.eat();
        dog.sleep();

        Cat cat = new Cat();
        cat.eat();
        cat.sleep();

        System.out.println(Animal.MAX_AGE); // we can directly access static constant through the interface name
        System.out.println(Dog.MAX_AGE); // and we can also access it through child class name
        Animal.info(); // we are directly accessing the static method present in Animal interface using the interface name

        // Dog.info(); we cannot directly static methods of an interface using child class name
        // Because interface static methods belong only to the interface itself and are not inherited by implementing classes.

        dog.run(6, 8); // we can directly access the default method of interface through child class object
        // as a default method is inherited by the implementing class
    }
}
