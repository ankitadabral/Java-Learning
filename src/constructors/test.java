package constructors;

public class test {
    public static void main(String[] args) {
        Student student = new Student(); // here while creating the object constructor will be called
        // if we have not created any constructor in student class then in that case in above scenario java would have called the default constructor during object creation
        // But as we have already defined constructors in our class then in that case here the no argument constructor will be called for above line
        // and also we have not given any values inside the constructor then this will also intialize the instance variables with default value only.
        // and if suppose we have passed some value of name or any variable then that value would have been initialized

        /*
        Default constructor initializes the instance variables with their default values. ✅
           For example:
           int → 0
           String → null
           boolean → false
         */
        System.out.println(student.getAge());
        System.out.println(student.getName());// output will be the default values

        //now creating new object of class and calling another constructor

        Student student1 = new Student("Ankita", 25, 5);
        //IMP - if we have created more than one constructor then compiler will decide based on the parameter we passed which constructor to call
        System.out.println(student1.getName());
        System.out.println(student1.getAge());

        Student student2 = new Student(13, 3);
        System.out.println(student2.getAge());
        System.out.println(student2.getRollNo());

        // as when we have created our constructor then default constructor will not be called


    }
}
