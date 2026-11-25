package Collection_Framework.Map.WeakHashMap;

import java.sql.SQLOutput;
import java.util.WeakHashMap;

public class Weak_HashMap {

    public static void main(String[] args) {

        // Here, we are creating a WeakHashMap.
        // In a WeakHashMap, keys are held using weak references,
        // whereas values are held using strong references.
        // However, when a key is garbage collected, its corresponding entry
        // (including its value) is automatically removed from the map.
        WeakHashMap<String, Image> imagecache = new WeakHashMap<>();

        // In the below-mentioned approach, we are using String literals as keys.
        // String literals are stored in the String Pool and remain strongly reachable.
        // Therefore, even though WeakHashMap holds these keys using weak references,
        // the String Pool's strong reference prevents these key objects from being garbage collected.
        // As a result, these keys will not become eligible for garbage collection
        // as long as they remain strongly reachable.
        // imagecache.put(new String("img1"), new Image("Image 1"));
        // imagecache.put(new String("img2"), new Image("Image 2"));


        // Therefore, we will use the below-mentioned approach so that the keys can become eligible for GC.
        // First, we create a new String object and assign it to a strong reference.
        // Then, we put that object into the WeakHashMap as a key.
        // After that, we set the strong reference to null.
        // This removes the strong reference held by the key1 variable.
        // However, the WeakHashMap still holds the key using a weak reference.
        // Since no strong reference to this key object remains,
        // it becomes eligible for garbage collection.
        // The JVM may collect this key whenever it decides to run the Garbage Collector.
        // Once the key is collected, its corresponding entry is automatically removed from the WeakHashMap.

        String key1 = new String("img1");
        imagecache.put(key1, new Image("Image 1"));
        key1 = null;

        String key2 = new String("img2");
        imagecache.put(key2, new Image("Image 2"));
        key2 = null;

        System.out.println("printing image cache : " + imagecache);

        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running (some entries may be cleared) : " + imagecache);
    }

    private static void simulateApplicationRunning() {
        try {
            System.out.println("Simulating application running......");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Image {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}