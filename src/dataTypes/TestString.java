package dataTypes;

public class TestString {
    public static void main(String[] args) {
        String name = "Ankita Dabral"; // String is sequence of characters  (STRING is  a class)
        System.out.println(name);
        String address = new String("India");

        String a = new String("Ankita");  // created a new object and allocated the memory
        String b = new String("Ankita");  // created a new object and allocated the memory
        System.out.println(a == b); // The output is false because a is containing the memory location/ address of String "Ankita" (Object) and b is containing the memory location or address of String "Ankita" (Object). And not the actual string value "Ankita".
        // They contains two different memory location therefore value of a is not equals to value of b

        String c = "Ankita"; // Ankita is a literal directly assigned to c without creating any object using new keyword.
        String d = "Ankita"; // This "Ankita" is stored in string pool inside heap and no new memory will be allocated to same string untill we are not explicitly calling to create its new object to give them different memory.
        System.out.println(c == d);// The output is true as a and be both are pointing to String pool containing String "Ankita".

        String x = "Ankita"; //Memory is allocated to this String in string pool and x has got the reference of that memory
        String a1 = new String(x);
        String b1 = new String(x);
        String c1 = "   Ankita   ";
        String d1 = "Ankita";
        System.out.println(a1 == b1); // False as both are pointing to different memory location
        System.out.println(c1 == d1); // True, as both are pointing to string pool containing the same String
// a1 and b1 will be pointing to the memory location present in heap.
        // x, c1, d1 will be pointing to memory location stored in string pool.

        int length = name.length();
        System.out.println(length); // Length function gives the length of the string by counting the character. Length fuction counting starts from 1...
        char C = name.charAt(3); // CharAt function gives the character value present ata a particular point of a string.
        System.out.println(C); // CharAT starts counting by 0th index and goes upto length-1.

        String name2 = "Ankita dabral";
        System.out.println(name.equals(name2)); // equals function used to compare the actual string values
        System.out.println(name.equalsIgnoreCase(name2)); //equalsIgnoreCase function used to compare the string values while it ignore the case difference, and just checks the letter


        String str1 = "remote";
        String str2 = "REMOTE";
        int i = str1.compareTo(str2); // compareTo method compares the character lexicographically(dictionary order) character by character. If all the character are equal then it will return 0 it means strings are equal.(by using the ASCII values of character)
        System.out.println(i);
//What does compareTo return?" → negative, zero, or positive depending on the comparison.

        System.out.println(str1.compareToIgnoreCase(str2)); //CompareToIgnoreCase method compare the characters while ingonring the case difference

        String substring = name.substring(3);
        System.out.println(substring); // susbstring method gives the part of string (it is the continues part of string) from a String from the index which we are providing
        String substring2 = name.substring(2, 8); // susbstring method gives the part of string from a String from the index unti the index which we are providing
        System.out.println(substring2);
        String substring3 = name.substring(3, name.length());
        System.out.println(substring3);

        System.out.println(name.toUpperCase()); // to give the string value in upper case
        System.out.println(name.toLowerCase());// to give the string value in lower case.
        System.out.println(c1.trim()); // to remove the excess space present before and after the string.

        String newName = name.replace("Ankita", "Anki");// replcace method is used to to replace the old string with new one
        System.out.println(newName);
        String new_Name = name.replace('n', 'k'); // to replace a specific character
        System.out.println(new_Name);

        System.out.println(name.contains("kita")); // contains method checks whether the particluar character or substring is present in String or not
        System.out.println(name.contains("N"));
        System.out.println(name.contains("D"));
        System.out.println(name.contains("Andab"));

        System.out.println(name.startsWith("A"));
        System.out.println(name.endsWith("a"));
        System.out.println(name.endsWith("l"));

        String sttr = "";
        String sttr2 = " ";
        System.out.println(sttr.isEmpty()); // true as there is no space
        System.out.println(sttr2.isEmpty()); // false as there is one space and isEmpty method counts space as well

        System.out.println(sttr2.isBlank());// true beacuse it donot counts the space

        System.out.println(name.indexOf("a")); // give the index of character a which is coming at first
        System.out.println(name.lastIndexOf("a")); // give the index of character a which is coming at last

        int r = 40;
        String s = String.valueOf(r);// to convert integer into string
        System.out.println(s);

        String formattedStr = String.format("My name is %s and Iam %d years old", "Ankita", 25);
        System.out.println(formattedStr);

        System.out.println(name.subSequence(2, 9)); // same as substring method the continuous part of a string

    }

}
