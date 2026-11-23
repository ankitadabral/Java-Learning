package Collection_Framework.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_Demo {
    public static void main(String[] args) {

        // As hashmap stores value in key value pairs,
        // so we have two give two generics
        HashMap<Integer, String> map = new HashMap<>();

        // We have to use put method to add values in hashmap
        map.put(1, "Santoshi");
        map.put(2, "neha");

        // only 1 null key and multiple null values are allowed

        //As it does not allow same key multiple times
        //so here what happened is first we have assigned shubham to 3
        //and after that we have assigned Rahul to 3
        //it simply replaced the entry of shubham with Rahul
        // so shubham's entry get vanished
        // and only Rahul is present at key 3

        map.put(3, "Shubham");
        map.put(3, "Rahul");
        map.put(6,"Seema");
        map.put(7, "Seema");

        //printing map
        System.out.println();
        System.out.println("printing map after adding values : " + map);

        //we can fetch value of any key by using get method
        String student = map.get(3); // it will return the value present at key 3
        System.out.println();
        System.out.println("Printing value present at key 3 by using get method : " + student);

        System.out.println();
        System.out.println("Printing value for key 69 as this key does not exist : "+ map.get(69)); //it will return null as 69 key does not exist

        //we can check whether any key is present in our map or not by using containskey method
        //It returns boolean value
        System.out.println();
        System.out.println("printing whether key 50 exist in map or not : " + map.containsKey(50));

        //we can check whether any value/object is present in our map or not by using containsvalue method
        //It returns boolean value
        System.out.println();
        System.out.println("printing whether value Shubham exist in map or not : " + map.containsValue("Shubham"));

        // If we want to apply loop in a map
        //then we can first use map.keySet method and stores keys of map  in a set
        // and then apply loop
        Set<Integer> keys = map.keySet();
        System.out.println();
        System.out.println("printing map values by using for loop and map.keySet method : ");
        for(int i : keys){
            System.out.println(map.get(i));

        }

        //if we want to apply loop and want to fetch key value both in pair
        //then we can use map.entrySet method and store it in a set and then apply loop

        Set<Map.Entry<Integer, String>> entries =map.entrySet();
        System.out.println();
        System.out.println("printing map key value pair by using for loop and using map.entrySet method");
        for(Map.Entry<Integer, String> entry : entries){
            System.out.println(entry);

            //if we want to make all the entries in uppercase
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println("printing map after changing in uppercase : " +map);

        // we can also remove value from map from particular key by using remove method
        System.out.println();
        System.out.println("prinitng value of key 7 that we have removed by using remove method : "+ map.remove(7));

        //or we can also remove by using remove(key, value)
        System.out.println();
        System.out.println(map.remove(3,"RAHUL")); // it returns true or false

        System.out.println("Printing map after removing 3 and 7 key : " + map);

    }
}
