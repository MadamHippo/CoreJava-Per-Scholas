package com.perscholas.java_basics.operators;

public class JavaQuestion6 {
    public static void main(String[] args) {

        // question 6:
        int number = 100;
        System.out.println(number);
        number++;
        System.out.println(number);
        // prints 100, then prints 101


        // question 7:
        int increment = 100;
        increment++;
        System.out.println(increment);
        increment+=1;
        System.out.println(increment);
        increment = increment + 1;
        System.out.println(increment);


        // question 8:
        int x = 5;
        int y = 8;
        int sum = ++x+y;
        // pre-fix Value is incremented first, and then result is computed.
        System.out.println(sum);
        // prints 14...

        int x1 = 5;
        int y1 = 8;
        int sum2 = x1+++y1;
        // post fix...value is first used for computing a result and then incremented.
        System.out.println(sum2);
        // prints 13 because value is used first and then incremented








    }
}
