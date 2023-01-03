package com.perscholas.java_basics.hackkerank;

public class FourthBit {

    public static void main(String[] args) {
        // put stuff here hippo
    }
    /*
     * Complete the 'fourthBit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER number than parameter.
     */

    public static int fourthBit(int number) {
        // Write your code here

        String binary_Number = Integer.toBinaryString(number);
        System.out.println(binary_Number);


        int length = binary_Number.length();
        return binary_Number.charAt(length - 4) - '0';
        // '0' = char type
        // Comparing the ASCII number with '0', if after the subtraction, the result is 0, then this char must be '0' ....
        // Else, if the result is 1, since the ASCII number of '1' is larger than '0' by 1, it should be '1'


    }
}
