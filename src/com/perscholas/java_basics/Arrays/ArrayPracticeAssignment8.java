package com.perscholas.java_basics.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPracticeAssignment8 {
    public static void main(String[] args) {
        /*
        Write a program that creates a String array of 5 elements and swaps
        the first element with the middle element without creating a new array.
         */

        String[] stringArray = {"Candy", "Buttons", "Penny", "Ice", "Dog"};

        String temp;
        int middleIndex = stringArray.length/2;
        // prints out index of 2...

        // value swapping, and if you swap you will need a temp variable
        temp = stringArray[0];
        stringArray[0] = stringArray[middleIndex];
        stringArray[middleIndex] = temp;

        System.out.println(Arrays.toString(stringArray));
        // prints [Penny, Buttons, Candy, Ice, Dog]
    }
}
