package oops.inheritance_Overriding.inheritance;

public class test {
    public static void main(String[]args){
        Dog dog = new Dog();// here we are creating Dog class object
        dog.setAge(5);
        dog.setName("Bob");
        dog.eat();
        dog.sayHello(); // here the output will be woof
        // as we have override the method sayHello in dog class and added our own defination for that particular method
        // Above Dog class inherits properties from Animal class and also overrides its one method as Dog is extending Animal class

        // Similarly Cat class is also inheriting Animal class and inheriting property from animal class
        // and Cat class also override 1 method of animal class

        Cat cat = new Cat();
        cat.setAge(3);
        cat.setName("mickey");
        cat.sayHello();// calling overriden method and output will be Meow

        // This above scenario is called HIERARCHIAL INHERITANCE
        // Class B and CLASS A both are extending CLASS C

    }
}
