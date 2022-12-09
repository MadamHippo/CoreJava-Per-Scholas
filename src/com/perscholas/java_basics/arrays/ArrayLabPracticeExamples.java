package com.perscholas.java_basics.arrays;

public class ArrayLabPracticeExamples {
    public static void main(String[] args) {
        // Lab 303.3.3 - Array Access Elements

        // Practice 1
        int[] age = {12, 4, 5, 2};
        // accessing each array elements...
        System.out.println("First element: " + age[0]);
        System.out.println("Last element: " + age[3]);


        // Practice 2
        int[] weight = {12, 4, 0};
        for (int i=0; i<weight.length; i++){
            System.out.println(weight[i]);
            // prints out each element by looping through the array
        }

        // Practice 3 using enhanced for loops...
        String[] names = {"New York", "Florida", "Washington"};

        for (String name:names){
            System.out.println(name);
            // prints out each name.
        }

        // Practice 4: Compute sum average of array of elements
        // Practice 5: Find Mean and Standard Deviation
        // Practice 6: Inserting an element at the end of an Array in Java

    }
}
