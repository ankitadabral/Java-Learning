package Collection_Framework.Map.HashMap.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//LinkedHashMap is subclass of HashMap
//Main Difference between LinkedHashmap and HashMap is that LinkedHashMap maintains the order of insertion
//and HashMap does not maintain order
//and it uses doubly linked list to store the data
public class LinkedHashMap_Demo {
    public static void main(String[] args) {

        // We can also give the access order along with capacity and load factor
        //by default the access order value is false
        //It means the values will get print normally by maintaing insertion order
        // And if we give access order = true then it means
        //the value which we access (ex= linkedhashmap.get("Apple)) by using get method
        // that value will get added in the last position of linkedhashmap

        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(11,04f, true);
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple",20);
        linkedHashMap.put("Guava", 13);

        linkedHashMap.get("Apple");

        for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()){
            System.out.println("Printing linkedhashmap : "+ entry.getKey() + " : " + entry.getValue());
        }

        // We can also convert hashmap into linked hashmap by below mentioned way
        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap<>(hashMap);

        hashMap.put("Shubham", 91);
        hashMap.put("Bob", 89);
        hashMap.put("Akshit" ,99);

        //We can also use getOrDefault() method with hashmap and linked hash map both
        //it works as , we have to pass key and a default value inside () and it will return the value of that key if present
        // if that key is not present than it will return default value

        Integer res = hashMap.getOrDefault("Vipul",9);
        Integer res1 = hashMap.getOrDefault("Shubham",1);

        System.out.println();
        System.out.println("printing value by getOrDefault method for the value which do not exist in map(vipul): "+ res);
        System.out.println("printing value by getOrDefault method for the value which exist in map (Shubham): "+ res1);

        // We can also use putIfAbsent method in hashmap and linkedhashmap both
        // It takes key and value pair same as put method
        //but it first checks the key if the key is already present in map then it would not update it just like put
        // it only add key after checking that it is not present in map

        System.out.println("Printing value by using putIfAbsent method: " + hashMap.putIfAbsent("Shubham",98));//it returns previous value which is associated
        //with key if it is already present
        //and returns null if it is not present


    }
}
