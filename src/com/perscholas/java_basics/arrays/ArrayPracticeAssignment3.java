package com.perscholas.java_basics.arrays;
// I forgot to import the util.Array at first....
import java.util.Arrays;

public class ArrayPracticeAssignment3 {
    public static void main(String[] args) {

        // Practice question #3
        // Write a program that creates an array of String type and initializes
        // it with the strings “red”, “green”, “blue” and “yellow”. Print out the
        // array length. Make a copy using the clone( ) method. Use the Arrays.toString( )
        // method on the new array to verify that the original array was copied.

        String[] colors = {"red", "green", "blue", "yellow"};

        System.out.println(colors.length);

        String[] colorsClone = colors.clone();

        // Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
        System.out.println(Arrays.toString(colorsClone));


    }
}
