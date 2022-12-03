package com.perscholas.java_basics.Operators;

public class JavaQuestion5 {
    public static void main(String[] args) {
        // Write a program that declares three int variables x, y, and z.
        int x = 7;
        int y = 17;

        // bitwise "&" operation
        // predict result of the bitwise & operation on x and y...um well according to a youtube tutorial i just looked up lol...
        // it will check bitwise (aligned up) if both are 1 answer is 1. Otherwise, it's 0.
        // 10001 = 17
        // 00111 = 7
        // which equals...0001 which is 1
        // prints 1
        // assign to z
        int z = x&=y;
        System.out.println(z);
        // z is now 0001

        // now "OR" operation
        // if any value is 1, then it's 1. 1 is now dominate here whereas in AND it was 0.. So opposite!
        int x1 = 7;
        int y1 = 17;
        int or_value = x1|=y1;
        System.out.println(or_value);
        // 10001
        // 00111
        // align and match up bits = 10111 from binary is 23
        // will print 23

    }
}
