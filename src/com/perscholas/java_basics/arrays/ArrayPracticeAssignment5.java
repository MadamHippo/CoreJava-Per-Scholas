package com.perscholas.java_basics.arrays;

import java.util.Arrays;

public class ArrayPracticeAssignment5 {
    public static void main(String[] args) {
        /*
        Write a program where you create an integer array with a length of 5.
        Loop through the array and assign the value of the loop control variable
        (e.g., i) to the corresponding index in the array.
         */

        // THis question is confusing, IDK what its asking because the wording confuses me...

        /* Just realized...are you suppose to use Scanner with this or no...?

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some integers...");
        int[] intArray = new int[5];
        intArray[0] = scanner.nextInt();
        intArray[1] = scanner.nextInt();
        intArray[2] = scanner.nextInt();
        intArray[3] = scanner.nextInt();
        intArray[4] = scanner.nextInt();

        Nevermind..read second part of question...
        */


        /* int[] intArray = new int[5];
        int[] intArray = {2, 10, 5, 8, 100};
        int i;
        for (i=0; i<intArray.length; i++) {
            System.out.println(i);
        }
        System.out.println(Arrays.toString(intArray));
        */


        int[] intArray = new int[5];

        for (int i = 0; i<intArray.length; i++){
            intArray[i] = i;
        }
        System.out.println(Arrays.toString(intArray));
        // prints out 0, 1, 2, 3, 4...




    }
}
