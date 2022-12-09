package com.perscholas.java_basics.variables.CoreJavaPracticeBookQuestions;

import java.util.Scanner;

public class PracticeBookQuestion10 {
    public static void main(String[] args) {
        // Test Average...

        Scanner scan = new Scanner(System.in);
        System.out.println("Test score:");
        int test1 = scan.nextInt();
        System.out.println("Test score:");
        int test2 = scan.nextInt();
        System.out.println("Test score:");
        int test3 = scan.nextInt();

        double test_average = (test1 + test2 + test3) / 3;
        System.out.println(test_average);


    }
}
