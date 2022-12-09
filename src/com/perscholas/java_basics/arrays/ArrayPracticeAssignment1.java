package com.perscholas.java_basics.arrays;

public class ArrayPracticeAssignment1 {
    public static void main(String[] args) {

        // Problem #1...print each array element...

        // print out each array element
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        for(int num:intArray){
            System.out.println(num);
            // num is each item in the intArray so just print that
        }
    }
}
