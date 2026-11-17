package arrays;

import java.util.Arrays;

public class array_1D {
    public static void main(String[] args) {

        //An array is a collection of multiple values of the same data type stored under one variable name.
        // Syntax : type[] variableName;

        int[] arr = new int[5];  // Creating array of 10 indexes
        arr[3] = 56; // Putting value in that particular index
        arr[4] = 32;
        for (int i = 0; i < arr.length; i++) {  // With the help of .length (.length is the property of array and not any method) we rae making it free any time the array index gets changes it automatically gets the length of the array and loop will work correctly
            System.out.println(arr[i]);    // Printing value of that particular index
        }
        System.out.println(arr.length); //printing the total length of array

        //Example syntax of printing an array
        int[] arr1 = {1, 22, 31, 4};

        // Wrong way of printing a array. It will return the hash code "[I@7b23ec81"
        System.out.println(arr1);

        // The correct way to print a array is using a loop
        for (int i1 = 0; i1 < arr1.length; i1++) {   //here i1 denotes the index of array
            System.out.println(arr1[i1]);  // as i1 is index that' why we have printing it like arr1[i] for the actual values
        }

        for (int I : arr1) {     // here I denotes the actual values of array from index 0 and completely goes till the end of the array
            System.out.println(I); // as I is pointing to the values that's why we are directly printing I
        }


        // Example : Search an element in an array with its index

        int[] Arr = {1, 4, 55, 6, -2, 6};
        int target = 55;
        for (int a = 0; a < Arr.length; a++) {
            if (Arr[a] == target) {
                System.out.println("Present" + " " + a);

            }
        }


        // Example 2: Find the max element in an array

        int[] num = new int[5];
        num[0] = -2;
        num[1] = 12;
        num[2] = -4322;
        num[3] = -32;
        num[4] = -22;
        int res = 0;
        int ind = 0;

        // First way (This is getting failed in case where all the values are in negative as we are storing 0 in res
        //THIS IS THE WRONG WAY
        for (int b = 0; b < num.length; b++) {
            if (num[b] > res) {
                res = num[b];
                ind = b;
            }
        }
        System.out.println("Max element is " + res + "and present at " + ind);


        //Second way  - THIS IS THE CORRECT WAY . This is working even when all the numbers are in negative as we are storing Integers min value as reference
        //For-each loop in Java
        //A for-each loop is used to go through each element of an array or collection, one by one.
        int max = Integer.MIN_VALUE;
        for (int d : num) { // this is the for each loop only
            if (d > max) {
                max = d;
            }
        }
        System.out.println("Max value in num arr is: " + max);


        //EXAMPLE 3 - Reverse print an array

        int[] Num = {1, 3, 67, 45, 2, 98, 0, 6};
        for (int e = Num.length - 1; e >= 0; e--) {
            System.out.println(Num[e]);
        }


        // EXAMPLE 4 : Find sum of an array

        int[] ar = {-2, 4, 55, -4, 11, -55, -11, 2};
        int sum = 0;
        for (int f = 0; f < ar.length; f++) {
            sum = sum + ar[f];
        }
        System.out.println(sum);

        //OR by using for each loop
        for (int F : ar) {
            sum += F;
        }
        System.out.println(sum);

    }
}

/*  1D Array in Java

A 1D (one-dimensional) array is simply a single row/list of values of the same data type.

Think of it like this:

Index:    0    1    2    3    4
          ↓    ↓    ↓    ↓    ↓
Array:   [10] [20] [30] [40] [50]

 */
