package Collection_Framework.Map.SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

// Sorted Map is an interface which implements map
//And its implementation class is TreeMap.

//Hierarchy is :
//Map (Interface)
//    ↑ extends
//SortedMap (Interface)
//    ↑ extends
//NavigableMap (Interface)
//    ↑ implements
//TreeMap (Class)

// It guarantees that entries are sorted based on their keys,
//// either in their natural ordering or according to a specified Comparator.
// null keys are not allowed here as treemap or sorted map needs to sort based on keys
// Treemap stores key value pair internally in red black tree or self-balancing tree
public class SortedMapDemo {
    public static void main(String[] args) {

        // Here, we created a TreeMap object using a SortedMap reference.
        // This is possible because TreeMap implements NavigableMap,
        // and NavigableMap extends the SortedMap interface.

        // If we want to change the sorting order, we can explicitly provide a Comparator.
        // If we do not provide a Comparator, TreeMap uses the natural ordering of keys.
        SortedMap<Integer, String> map = new TreeMap<>((a,b)->{return b-a;});
        //it will now sort in descending order
        map.put(90, "Vivek");
        map.put(99, "Mohit");
        map.put(78,"Shubham");
        map.put(67, "amit");
        map.put(76, "Harsh");
        map.put(87,"Shivam");

        map.get(76);
        map.containsKey(78);
        map.containsValue("Shivam");
        // The output will get sorted in ascending order of keys (natural ordering)
        System.out.println("Printing map values: " + map);

        // Some important methods of SortedMap that are not directly available in the Map interface.
        // These methods allow us to access keys and entries based on their sorted order.
        System.out.println("printing first key of map : "+ map.firstKey());
        System.out.println("printing last key of map : "+ map.lastKey());

        // headMap() returns all entries that come before the given key.
        //it means from the head till the value given and the given value is excluded

        // tailMap() returns all entries starting from the given key and going till the end.
        //it means from the give value till the tail
        //given value is included in this
        System.out.println("Printing values using headMap method : " + map.headMap(99));
        System.out.println("Printing values using tailmap method : " +map.tailMap(90));

        // subMap() returns entries within a specified range of keys.
        // The starting key is included, but the ending key is excluded.
        System.out.println("Printing map.submap method : "+ map.subMap(87, 67));


    }
}
