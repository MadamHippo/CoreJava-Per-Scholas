package com.perscholas.java_basics.arrays;

public class ArrayPracticeAssignment7 {
    public static void main(String[] args) {
        /*
        Write a program where you create an array of 5 elements.
        Loop through the array and print the value of each element,
        except for the middle (index 2) element.
         */

        int[] intArray = {2, 15, 2, 36, 8};

        for (int i=0; i<intArray.length; i++){
            if (i != intArray.length/2){
                System.out.println(intArray[i]);
            }
        }
    }
}
