package Collection_Framework.Collection.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// ConcurrentHashMap class implements concurrent Interface
// ConcurrentHashMap was introduced to overcome the performance issues of Vector, Stack, and Hashtable,
// where synchronized methods can cause threads to wait, reducing performance.

//Java 7 ----> segment based locking ---> 16 segments(by default) -----> smaller HashMaps
// Only the segment being written to or read from is locked other segments are not locked
//read : Operation does not require locking unless there is a write operation happening on the same segment
// write : operation will aquire lock of a particular segment

// Java 8 ---> no segmentations
// It uses Compare and Swap (Set) approach ---> no locking except resizing or re locking
// CAS - Thread A last saw ---> x = 42
//       thread A work --->   x = 50
// then CAS will first compare if x is still 42 then change it to 50 else do not change and retry(means again CAS)
//so in this above case there is no locking it is just a process

// And here in concurrent hashMap resizing does not happen like HashMap where the
//array size gets double
//instead here will be incremental resizing happens it means firstly 1 bucket more will be added
public class ConcurrentHashMapDemo {
    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

    }
}
