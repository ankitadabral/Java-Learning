package loops_CondStatements;

public class loops {
    public static void main(String[] args) {

        // While Loop - Here first the condition will be checked and then code will be executed
        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("Done");


        // do While Loop - here for once the do code will be executed and then the while condition will be checked
        int a = 40;
        do {
            System.out.println(a);
            a++;
        }
        while (a <= 10);


        //For Loop for(initialisation; condition; update)
        for (int j = 1; j <= 3; j++) {
            System.out.println(j);
        }


        /* Example for loop :  Print :
         * 1
         * 10
         * 100
         * 1000
         * 10000        */

        for (int x = 1; x <= 10000; x *= 10) {
            System.out.println("*" + " " + x);
        }

        for (int y = 1, z = 1; z <= 6; y *= 10, z++) {
            System.out.println("*" + " " + y);
        }

        // Example 2 -Print table of 7
        for (int e = 1; e <= 10; e++) {
            System.out.println(7 + "X" + e + "=" + e * 7);
        }


        // Example 3 - Print sum of first 10 natural numbers
        int sum = 0;
        int g = 1;
        while (g <= 10) {
            sum = sum + g;
            g++;
        }
        System.out.println(sum);


        // Example 4 :Count digits of a number - 456776545678
        int n = 456776678;
        int res = 0;
        while (n > 0) {
            n = n / 10;
            res++;
        }
        System.out.println(res);


        //Example 5: Print factorial of 6
        int a1 = 6;
        int res1 = 1;
        while (a1 > 0) {
            res = res * a1;
            a1--;
        }
        System.out.println(res1);


        /* Example 6 : Print below pattern // Nested for loop
         *
         **
         ***
         ****
         *****
         */

        for (int i1 = 1; i1 <= 5; i1++) {
            for (int j1 = 1; j1 <= i1; j1++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // Break and continue
        int I = 1;
        while (I <= 10) {
            if (I == 5) {
                I++; // if we donot put I++ then it will go to infinite loop
                continue; // it will skip current iteration and jumps to another iteration
            }
            System.out.println(I);
            I++;

        }

        while (I < 10) {

            System.out.println(I);
            if (I == 7) {
                break;
            }
            I++;
        }
        System.out.println("Hello");

    }
}

    /* "Difference between break and continue?", say:

break terminates the loop completely, whereas continue skips the current iteration and proceeds with the next iteration.
*/

