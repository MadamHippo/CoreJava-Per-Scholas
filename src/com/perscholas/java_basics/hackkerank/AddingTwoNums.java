package com.perscholas.java_basics.hackkerank;

public class AddingTwoNums {
        /*
         * Complete the 'addNumbers' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. FLOAT a
         *  2. FLOAT b
         */

    public static int addNumbers(float a, float b) {
            // float sum = a + b;
            // return (int)sum;

        float sum = Float.sum(a, b);
        return (int)sum;

    }
    public static void main(String[] args) {
        System.out.println(AddingTwoNums.addNumbers(2, 4));
    }

}
