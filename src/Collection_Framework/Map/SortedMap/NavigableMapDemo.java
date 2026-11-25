package Collection_Framework.Map.SortedMap;

import java.util.NavigableMap;
import java.util.TreeMap;

// Navigable map is a interface, and it extends Sorted Map Interface
//And Tree Map directly implements only Navigable Map
// have some additional method along with the methods by sorted Map and Map
public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(1, "One");
        navigableMap.put(2, "Two");
        navigableMap.put(3,"Three");
        navigableMap.put(4,"Four");
        navigableMap.put(5,"Five");
        System.out.println("Printing Navigable Map via Tree Map : "+navigableMap);

        //Below-Mentioned are the methods which are from Navigable Map

        //.lowerkey()
        //This method returns the greatest key strictly less than the given key
        System.out.println("Printing lower key than 3 by using lowerkey() method : "+ navigableMap.lowerKey(3));


        //return least greater or equals to the given key
        //ya to key k equal ya frr sbse choti bdi value given key se
        System.out.println();
        System.out.println("Printing the key equals to or least greater than the given key by using ceiling method : "+ navigableMap.ceilingKey(4));

        //higherEntry() method

        System.out.println();
        System.out.println("Printing key value pair of least higher key from the given key : "  +navigableMap.higherEntry(3));

        //Difference yaad rakho:
        //- Higher = strictly greater.
        //- Lower = strictly smaller.
        //- Ceiling = equal or greater.
        //- Floor = equal or smaller.
    }
}
