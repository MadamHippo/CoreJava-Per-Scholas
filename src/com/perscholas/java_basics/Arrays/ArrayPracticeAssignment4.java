package com.perscholas.java_basics.Arrays;

public class ArrayPracticeAssignment4 {
    public static void main(String[] args) {

        /*
        Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers.
        Print out the value at the first index and the last index using length - 1 as the index.
         */

        int[] intArray = {2, 5, 15, 9, 6};
        // accessing first num:
        System.out.println("First num: " + intArray[0]);
        // accessing second num:
        // notice that's the syntax to fetch the last element in an Array. Did not know that actually.....
        System.out.println("Last num: " + intArray[intArray.length-1]);

        /*
        Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).
        Notice the type of exception which is produced.

        Now try to assign a value to the array index 5. You should get the same type of exception.
         */

        // System.out.println(intArray[intArray.length]);
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

        // assigning value to array index 5...well that ain't gonna work
        // System.out.println(intArray[5] = 100);
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    }
}
