package accessModifiers.Zoo;

public class Dog extends Animal{

    public Dog(String name, String sound) {
        super(name, "bark");
        //super(name, bark) means call the parent constructor with "bark" as the second argument and the value of name as the first argument.

    }

    public void wagTail(){
        System.out.println(getName() + " is wagging its tail. ");
    }

    private String getName(){
        return getClass().getSimpleName();
        //getClass() → returns the class of the current object.
        //getSimpleName() → returns the simple name of that class.
    }

    public void setDogSound(String newSound){
        changeSound(newSound);
    }
}
