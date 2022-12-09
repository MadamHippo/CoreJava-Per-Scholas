package com.perscholas.java_basics.operators;

public class JavaQuestion4 {
    public static void main(String[] args) {
        // question 4
        int x = 150;
        System.out.println(Integer.toBinaryString(x));
        // prints out 10010110

        // right shift >> 2
        x = x >> 2;
        System.out.println(Integer.toBinaryString(x));
        // we are shifting to the right 2 places which will make it...100101...which is 37?
        // so my GUESS is...shifting to the right shrinks the number...always?
        System.out.println("Right shift >> 2: " + x);
        // prints 37


        // Do the following values...225, 1555, 32456
        int a = 225;
        int b = 1555;
        int c = 32456;

        System.out.println(Integer.toBinaryString(a));
        // 11100001
        System.out.println(Integer.toBinaryString(b));
        // 11000010011
        System.out.println(Integer.toBinaryString(c));
        // 111111011001000

        a = a >> 2;
        b = b >> 2;
        c = c >> 2;

        // after shifting:
        System.out.println("Reassigned: " + Integer.toBinaryString(a));
        System.out.println("Reassigned: " + Integer.toBinaryString(b));
        System.out.println("Reassigned: " + Integer.toBinaryString(c));

        // new number values
        System.out.println(a);
        // 56
        System.out.println(b);
        // 388
        System.out.println(c);
        // 8114





    }
}
