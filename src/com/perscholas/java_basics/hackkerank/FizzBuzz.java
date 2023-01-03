package com.perscholas.java_basics.hackkerank;

import java.io.*;

public class FizzBuzz {

    public static void main(String[] args) throws IOException {
        // fill in hippo
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        FizzBuzz.fizzBuzz(n);

        bufferedReader.close();
    }
    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {

        for (int i=1; i<=n; i++) {

            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                //prints if the number is multiple of 3
                System.out.println("Fizz");
            } else if (i%5==0)
                System.out.println("Buzz");
            else
            {
                System.out.println(i);
            }

        }

    }
}
