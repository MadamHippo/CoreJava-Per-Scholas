package com.perscholas.java_basics.variables.CoreJavaPracticeBookQuestions;

import java.util.Scanner;

public class PracticeBookQuestion13 {
    public static void main(String[] args) {
        // Restaurant bill...
        double tax = 0.0675;
        double tip = 0.20;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter meal price:");
        Double mealCost = scan.nextDouble();

        double mealWithTax = mealCost * tax;
        // tax charge ONLY total
        double mealWithTip = mealCost * tip;
        // tip charge ONLY total

        System.out.println(mealWithTax);
        System.out.println(mealWithTip);

        double totalCost = mealWithTax + mealWithTip + mealCost;
        // total meal cost overall

        System.out.println(totalCost);

    }
}
