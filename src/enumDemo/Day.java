package enumDemo;

//In Java, an enum (enumeration) is a special type used to represent a fixed set of constants (predefined values).
//Enums were introduced to provide type-safe, readable, and fixed sets of constants.
public enum Day {

    SUNDAY("sunday", "ravivar"),
    MONDAY("monday", "somvar"),
    TEUSDAY("teusday", "mangalvar"),
    WEDNESDAY("wednesday", "budhvar"),
    THURSDAY("thursday", "guruvar"),
    FRIDAY("friday", "shukrvar"),
    SATURDAY("saturday", "shanivar");
    // these values are the instances(object) of Day enum


    // defining a field(variable) inside a ENUM
    private String lower;
    private String hindi;


    //Creating getter for private variable
    public String getLower() {
        return lower;
    }

    public String getHindi() {
        return hindi;
    }


    // Creating parameterized constructor for variable
    private Day(String lower, String hindi) {
        System.out.println("Our constructor called");
        this.lower = lower;
        this.hindi = hindi;
    }


    // Creating a method inside enum
    // and we can run this method with each instance of the ENUM class
    public void display(){
        System.out.println("Today is " + this.name());
    }
}












// INTERNAL WORKING OF ENUM CLASS BY JVM
// What the actual code of this class be run by JVM

/*

public final class Day extends java.lang.Enum<Day>{
    public static final Day SUNDAY = new Day("SUNDAY", 0);
    public static final Day MONDAY = new Day("MONDAY", 1);
    public static final Day TEUSDAY = new Day("TEUSDAY", 2);
    public static final Day WEDNESDAY = new Day("SUNDAY", 3);
    public static final Day THURSDAY = new Day("SUNDAY", 4);
    public static final Day FRIDAY = new Day("SUNDAY", 5);
    public static final Day SATURDAY = new Day("SUNDAY", 6);

    private static final Day[] VALUES ={SUNDAY, MONDAY, TEUSDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};

    private Day(String name, int ordinal){
        super(name, ordinal);
    }

    public static Day[] values() {
        return VALUES.clone();
    }

    public static Day valuesOf(String name){
        for(Day day : VALUES) {
            if (day.name().equals(name)){
                return day;
            }
        }
        throw new IllegalArgumentException("No enum constant " + name);
    }
}


 */
