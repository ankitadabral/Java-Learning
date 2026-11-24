package Collection_Framework.Map.HashMap.LinkedHashMap;

//LRU means least recently used cache
//LRU (Least Recently Used) is a caching technique in which, when the cache becomes full,
//the item that has not been used for the longest time is removed.


import java.util.LinkedHashMap;
import java.util.Map;

public class LRU_Cache<K, V> extends LinkedHashMap<K, V> {

    private int capacity;

    //creating constructor
    public LRU_Cache(int capacity){
        super(capacity, 0.75f,true);
        this.capacity=capacity;
    }

    //here we are overriding removeEldestEntry method of linkedhashmap
    //and providing it our definition
    //It returns true if the eldest entry should be removed
    //and false if it should be retained


    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() >capacity;
    }

    public static void main(String[] args) {

       LRU_Cache<String, Integer> studentMaap = new LRU_Cache<>(3);
       studentMaap.put("Bob", 99);
        studentMaap.put("Alice", 89);
        studentMaap.put("Ram", 91);
        studentMaap.put("Vipul",89);


        System.out.println("Priinting LRU after adding values and overriding removeEldestEntry method in our class : " +studentMaap);
        // herein out put bob will get removed

        // here in output we will get only 3 key value pair which we have recenltly used
        // and the pair which is least recently used will get removed
        //as we have already defined the capacity as 3
        //and in LRU removeEldestEntry method we have defined that if size> capacity
        //then return true and remove the entry

        studentMaap.get("Bob");

        System.out.println("Printing LRU after using get method for Bob : " +studentMaap);
        //here now still the output will be same
        //it is because bob is already removed before when we added vipul above
        //and we are using get method for bob after that, so it will not affect
        //but yes if we use this get line before writing put vipul
        //then output will be changed and Alice will get removed
        //And put and get both comes under the category of using values


    }
}
