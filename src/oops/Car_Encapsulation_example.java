package oops;

public class Car_Encapsulation_example {
    // Object - Object have "Properties" and "Behaviour"
    // Class - It is a blueprint of an object

    // Let's for example below mentioned are the property of a car
    // ECAPSULATIONS - Bundling of data and methods into a single unit(class). OR if we want to hide the data then it can be achieved with the help of encapsulation
    //So for achieving encapsulation or we do not want to expose our properties/fields we will make them private
    // Below is the example of encapsulation


    private String color;
    private String brand;
    private String model;
    private int year;
    private int speed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
// Let's for example below mentioned are the behaviour of a car  which in java we mention as methods

    public void accelerate(int increment) {
        speed += increment;
    }

    public void brake(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
    }


}

 /* In below mentioned variable we are not making them private so any one can change their value and set them by creating object of this class.
    So in this case there is a loss if we do not want to expose our variables or we donot want that anybody can change their value then in below mentioned case it is not possible

    String color;
    String brand;
    String model;
    int year;
    int speed;
*/
