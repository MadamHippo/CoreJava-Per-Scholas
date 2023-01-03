package com.perscholas.java_basics.hackkerank;

import com.perscholas.java_basics.classes.InClassExercises.Main;

import java.util.*;


public class SumThemAll {
    /*
     * Complete the 'arraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static int arraySum(List<Integer> numbers) {
        // Write your code here

        /*

        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
        */

        int sum2 = 0;
        // writing it as a for-each loop
        for (int num : numbers)
        {
            sum2 += numbers.get(num);
        }
        return sum2;

    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(new Integer[]{2, 3, 5, 3});
        System.out.println(SumThemAll.arraySum(input));
    }
}