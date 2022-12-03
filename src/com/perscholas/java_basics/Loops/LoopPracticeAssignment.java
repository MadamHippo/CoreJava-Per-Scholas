package com.perscholas.java_basics.Loops;

import java.util.Scanner;

public class LoopPracticeAssignment {
    public static void main(String[] args) {

        // Question #1: Write a program that uses nested for loops to print a multiplication table.

        for (int i=1; i<=12; i++){
            for (int j=1; j<=12; j++){
                int k = i*j;
                // what the heck is "%5d" and printf is...?
                System.out.printf("%5d", k);
            }
            System.out.println("\n");

        }
        System.out.println("****************************************");


        // Question #2 Find the user's Greatest Common Divisor using scanner
        System.out.println("Enter a positive integer:");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println("Enter a second positive integer:");
        int num2 = scan.nextInt();

        /*
        my first try...not efficient

        for (int k=2; k<num1 || k<num2; k++){
            int smallInteger = Math.min(num1, num2);
            int largeInteger = Math.max(num1, num2);
            if (smallInteger % k == 0 && largeInteger % k == 0){
                System.out.println(k);
            }
        }
         */


        // Hippo's way - starting off the top
        for (int k=Math.min(num1, num2); k>0; k--){
            if (num1 % k == 0 && num2 % k == 0){
                System.out.println(k);
                break;
            }
        }

        System.out.println("****************************************");




        // Question #3 Predict Future Tuition
        // Suppose the tuition for a university is $10,000 for the current year
        // and increases by 7 percent every year. In how many years will the tuition be doubled?
        int tuition = 10000;
        int year = 0;

        while (tuition <= 20000){
            tuition *= 1.07;
            year++;
        }
        System.out.println("It will double in: " + year + " years");
        // will print year 11. It will double to 20,000 in 11 years @ 7%.

        System.out.println("****************************************");

    }
}
