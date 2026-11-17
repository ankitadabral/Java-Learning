package oops.abstraction;

public class test {

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.sayHello();
        System.out.println(dog.getHasSuperpowers());

        Animal animal = new Dog(); // here we are doing up casting. With parent class reference we are creating object of child class.
        // so it is possible with abstract class also
        animal.sayHello();

        // Animal ani = new Animal();
        // But we cannot directly create a object of abstract class it is not allowed
    }
}
