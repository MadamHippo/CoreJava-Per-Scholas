package com.perscholas.java_basics.variables.CoreJavaPracticeBookQuestions;

import java.util.Scanner;

public class PracticeBookQuestion9
{
    public static void main(String[] args) {
        // Miles per gallon calculation...

        // MPG = Miles driven / Gallon of gas used....

        Scanner scanning = new Scanner(System.in);
        System.out.println("How much did you drive?:");

        double miles_driven = scanning.nextDouble();

        Scanner scan = new Scanner(System.in);
        System.out.println("How many gallons did you use?:");
        double gallon_used = scan.nextDouble();

        double MPG = miles_driven / gallon_used;

        System.out.println(MPG);

    }
}
