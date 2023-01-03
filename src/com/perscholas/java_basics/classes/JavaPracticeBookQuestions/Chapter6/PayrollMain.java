package com.perscholas.java_basics.classes.JavaPracticeBookQuestions.Chapter6;

import java.util.Scanner;

public class PayrollMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // create a scanner object


        System.out.println("Enter your hours worked: ");
        int inputHours = scan.nextInt(); // Read user input



        System.out.println("Enter your hourly rate: ");
        double inputRate = scan.nextDouble();

        Payroll person1 = new Payroll("Rachelle Love", "582-9931");

        person1.setHoursWorked(inputHours);
        person1.setHourlyRate(inputRate);

        System.out.println(person1.grossPay());


    }
}
