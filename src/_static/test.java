package _static;

public class test {
    public static void main(String[] args) {

        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student();
        System.out.println(Student.count);// here we are direclty accessing count variable through class name
        // and as we have created 3 object so it will give output 3
        // but if we have not made cout static then in that case we need to access through the object only
        // and for each object count will run seperately so output will be 1 always

        Student.getCount(); // here we are directly calling that static method
    }
}
