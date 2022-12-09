package com.perscholas.java_basics.variables.CoreJavaPracticeBookQuestions;

import java.util.Scanner;

public class PracticeBookQuestion17 {
    public static void main(String[] args) {
        // Ingredient adjuster...
        double sugar = 1.5;
        double butter = 1;
        double flour = 2.75;
        int totalCookie = 40;


        Scanner scan = new Scanner(System.in);
        System.out.println("How many cookies?:");
        int cookieCount = scan.nextInt();

        double perSugar = (sugar/totalCookie)*cookieCount;
        double perButter = (butter/totalCookie)*cookieCount;
        double perFlour = (flour/totalCookie)*cookieCount;

        // System.out.println(perSugar + "\n" + perButter + "\n" + perFlour + "\n" + cookieCount);
        String answer = String.format("To make %d cookies, you will need %.2f sugar, %.2f butter, and %.2f cups of flour.", cookieCount, perSugar, perButter, perFlour);
        System.out.println(answer);


    }
}
