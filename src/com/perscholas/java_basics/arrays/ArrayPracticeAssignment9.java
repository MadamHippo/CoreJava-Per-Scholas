package com.perscholas.java_basics.arrays;

import java.util.Arrays;

public class ArrayPracticeAssignment9 {
    public static void main(String[] args) {

        /*
        Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
        Print the array in ascending order, and print the smallest and the largest element of
        the array. The output will look like the following:
         */


        int[] sortArray = {4, 2, 9, 13, 1, 0};

        /*

        // Not efficient, no matter where the smallest element 0 is, it will run all the way through...

        int temp;
        for (int h = 0; h<sortArray.length-1; h++){
            for (int i=0; i<sortArray.length-1; i++){
                if (sortArray[i] > sortArray[i+1]){
                    temp = sortArray[i];
                    sortArray[i] = sortArray[i+1];
                    sortArray[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(sortArray));
        */


        // Not sure if we were suppose to cheat and use built in sort...or...
        // Arrays.sort(sortArray);



        // Hippos way...this is better because there are conditionals in the second for-loop (j) to save some runtime
        int temp;
        for (int i=0; i<sortArray.length-1; i++){
            // if (sortArray[i] > sortArray[i+1]){
                for (int j=i; j>=0 && sortArray[j] > sortArray[j+1]; j--) {
                    temp = sortArray[j];
                    sortArray[j] = sortArray[j + 1];
                    sortArray[j + 1] = temp;
                }
            // }
        } System.out.println(Arrays.toString(sortArray));



    }
}
