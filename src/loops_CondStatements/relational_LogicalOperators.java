package loops_CondStatements;

public class relational_LogicalOperators {
    public static void main(String[] args) {
        // Relational Operators - compares two values and return boolean result
        int a = 1, b = 2;
        boolean c = a > b;
        boolean d = a == b;
        boolean e = a == b / 2;
        boolean f = a != b;
        boolean g = a <= b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        char A = 'a', B = 'z';
        boolean C = A == B;
        System.out.println(C);// ASCII values of the alphabets should be checked

        String str1 = "pool", str2 = "pool";
        String str3 = new String("pool");
        System.out.println(str1 == str2);// True as we are comaparing the location where pool string is stored. And both str1 and str2 are pointing to string pool memory where word pool is stored
        System.out.println(str1 == str3);//  False as str1 is pointing to the location of "pool" which is stored in string pool and str3 is pointing to the location of word pool which is stored in Heap memory.


        /*
        Logical Operators - used where we need to combine two conditions OR need to compare two boolean results or value
        && Logical AND
        || Logical OR
        ! Logical NOT
         */

        // Example (&& opr) - exam total marks = 100, need min marks = 33 , age should be <=18

        int MarksObt = 35;
        int age = 50;
        System.out.println(MarksObt >= 33 && age <= 18); // False for && operator both conditions should be true

        // Example (|| opr) - cond 1 = candidate should be from tier1  OR cond 2 = candidate exp should be >=5 yrs

        String name = "Ram";
        int exp = 3;
        boolean tier1 = true;
        System.out.println(exp >= 5 || tier1);// True for || opr either any one condition should be true and the output will be true


        // ! opr - It used to reverse a boolean value.
        boolean z = true;
        System.out.println(!z); // False
        System.out.println(!(4 < 3)); // True


    }
}
