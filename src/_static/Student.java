package _static;

public class Student {

    public static int count = 0;
    // This particular variable now belongs to class and not to instance as we have added static in it
    // so we can directly access it via class name

    static {    // Created static block
        System.out.println("Hello");
    }

    public Student(){
        count++;
    }

    private int rollNumber;
    private int age;
    private String name;

    // these all variables on which we have not added static these all belongs to the class instance/object
    // and to access them we need to create their object


    public static void getCount(){  // Now as we have made this method static it means now it belongs to this class
        // and we can access this method thorugh class name
        System.out.println("Total Students : " + count);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
