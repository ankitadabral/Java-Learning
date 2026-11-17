package accessModifiers.Test;


import accessModifiers.Zoo.Dog;

public class test {
    public static void main(String[] args) {

        Dog dog = new Dog("bob", "woof");
        dog.makeSound();
        dog.setDogSound("Woof");
        dog.makeSound();
        dog.wagTail();
    }
}
