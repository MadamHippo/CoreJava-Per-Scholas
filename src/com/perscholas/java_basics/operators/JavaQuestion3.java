package com.perscholas.java_basics.operators;

public class JavaQuestion3 {
    public static void main(String[] args) {

        // write a program that prints out binary string version of the number
        int x = 2;
        System.out.println(Integer.toBinaryString(x));
        // this prints 10

        // now use a shift operator to shift by 1 and assign to x
        x = x << 1;
        // i'm guessing if we shift to the left, we append a 0 to the left at the end of shift
        // binary would be 100...and decimal/int is 4.
        System.out.println(x);
        // yay got it right!
        // doing it again with 9, 17, 88...
        int nine = 9;
        int seventeen = 17;
        int eightyEight = 88;

        nine = nine << 1;
        seventeen = seventeen << 1;
        eightyEight = eightyEight << 1;

        System.out.println(nine);
        // prints 18
        System.out.println(seventeen);
        // prints 34
        System.out.println(eightyEight);
        // prints 176

    }

}
