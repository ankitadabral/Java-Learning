package Collection_Framework.Map.HashTable;

import java.util.Hashtable;

//HashTable is a legacy class, and now it is not used
//as it is now replaced by concurrent hashmap
//HashTable is thread safe and synchronized
//no null key and values are allowed
//Slower than HashMap
//all methods are synchronized here

//Its internal working is same as HashMap
//just one difference that it uses linked list only in case of collision
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Cherry");

        System.out.println("Pritning hash table : "+ hashtable);
        System.out.println("value for key 2 : "+ hashtable.get(2));
        System.out.println("Does key 3 exists : "+ hashtable.containsKey(3));

    //concurrency example
        //as it is thread safe that's why  output will be correct 2000
        Hashtable<Integer,String> hashtable1 = new Hashtable<>();

        Thread t1 = new Thread(()-> {
            for(int i = 0 ; i<2000 ; i++){
                hashtable1.put(i, "Thread 1");
            }
        });

        Thread t2 = new Thread(()-> {
            for(int i = 0 ; i<1000 ; i++){
                hashtable1.put(i, "Thread 2");
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();

            t2.join();
        } catch (InterruptedException e) {
         e.printStackTrace();
        }

        System.out.println("Printing hashtable size: "+ hashtable1.size());
    }
}
