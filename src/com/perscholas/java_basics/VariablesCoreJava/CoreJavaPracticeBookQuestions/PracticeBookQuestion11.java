package com.perscholas.java_basics.VariablesCoreJava.CoreJavaPracticeBookQuestions;

import java.util.Scanner;

public class PracticeBookQuestion11 {
    public static void main(String[] args) {
        // Circuit board profit...
        double profit = 0.40;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price:");
        double totalPrice = scan.nextDouble();
        double earnedProfit = profit * totalPrice;
        System.out.println(earnedProfit);
        // example if price is $88...profit is $35.2, which it prints



    }
}
