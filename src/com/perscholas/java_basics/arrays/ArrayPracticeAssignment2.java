package com.perscholas.java_basics.arrays;

public class ArrayPracticeAssignment2 {
    public static void main(String[] args) {

        /*
        Problem 2: write a program that give the center middle of the following int array
        int[] someArray = {13, 5, 7, 68, 2};

        int middle = someArray.length/2;
        System.out.println(someArray[middle]);
        // will print out 7.
        }

         */


        // that was rocky...lets try again with even number array
        int[] anotherArray = {3, 6, 19, 5};
        int middleIndex = anotherArray.length/2;
        System.out.println(anotherArray[middleIndex]);
        // the array is even, so it will print out index 2...which is 19. It will print out 19.
    }
}