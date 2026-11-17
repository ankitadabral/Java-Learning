package InnerClasses;


public class Computer {

    private String brand;

    private String model;

    private OperatingSystem os;// it is a instance variable which can staore object reference od Operatingsytem class

    public OperatingSystem getOs() { // we have created this getter to access os outside this class
        // as os variable is private access here

        return os;
    }

    public Computer(String brand, String model, String OSName) {
        this.model = model;
        this.brand = brand;
        this.os = new OperatingSystem(OSName); // here what we are doing is creating Operating system class object
        // And storing its reference in os instance variable which we have declared above
        //and also passing the value of OS name
    }

    // This is a MEMBER INNER CLASS
    class OperatingSystem {
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void displayInfo() {
            System.out.println("Computer Model: " + model + ", OS" + osName);
        }
    }

    // This is a STATIC INNER CLASS
    static class USB{

        private String type;

        public USB(String type){
            this.type= type;
        }

        void displayInfo(){
            System.out.println("USB type " + type);
        }
    }

}
