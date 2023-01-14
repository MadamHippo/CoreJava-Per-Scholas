package com.perscholas.java_basics.classes.JavaPracticeBookQuestions.Chapter6;

import java.util.Scanner;

public class MonthDaysMain {
    public static void main(String[] args) {

        // create scanner
        Scanner scan = new Scanner(System.in);

        // scanner prompt
        System.out.println("Which month are you asking about (enter a number 1 through 12):");

        // prompt user input
        int inputMonth = scan.nextInt();

        // scanner prompt
        System.out.println("Which year are you asking about:");

        // prompt user input for year
        int inputYear = scan.nextInt();

        // object instance
        MonthDays month = new MonthDays(inputMonth, inputYear);

        // calling month to find how many days there are in that month
        System.out.println(month.getNumberOfDays());

    }
}
