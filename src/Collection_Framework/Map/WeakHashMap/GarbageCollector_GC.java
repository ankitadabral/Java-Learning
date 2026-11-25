package Collection_Framework.Map.WeakHashMap;

import java.lang.ref.WeakReference;

// When we create objects in Java, they are stored in Heap Memory.
// When an object no longer has any reachable references, it becomes eligible for Garbage Collection.
// The Garbage Collector's job is to reclaim the memory occupied by such unused objects.


public class GarbageCollector_GC {
    public static void main(String[] args) {

        // Here we are creating an object of the Phone class with a strong reference.
        // It means the GC cannot collect this object as long as it is reachable through a strong reference,
        // unless we explicitly break the reference.


        Phone phone = new Phone("iphone 16 Pro", "Apple"); // this is a strong reference

        // Here we are setting the phone reference to null.
        // It means the object that this phone reference was pointing to is no longer reachable through this reference.
        phone = null;


        // This System.gc() will suggest/request the JVM to perform Garbage Collection and reclaim unused memory.
        // It does not mean that the object will be deleted immediately after writing this statement.
        // It is decided by the JVM when to run the Garbage Collector.
        System.gc();
        System.out.println("printing phone : " + phone);



        // Below, we are creating a weak reference to an object of the Vehicle class using the WeakReference class.
        // In this case, the JVM can collect the object because a Weak Reference cannot prevent it from being garbage collected.
        WeakReference<Vehicle> vehicle = new WeakReference<>(new Vehicle("XUV 700", "Mahindra"));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Exception Caught : " + e);
        }

        System.gc();
        System.out.println("Printing Vehicle : " + vehicle.get());

    }

}

class Phone {
    String model;
    String brand;

    public Phone(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }
}

class Vehicle {
    String Brand;
    String model;

    public Vehicle(String brand, String model) {
        this.model = model;
        this.Brand = brand;
    }

}