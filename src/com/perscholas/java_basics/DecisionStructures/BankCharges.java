package com.perscholas.java_basics.DecisionStructures;

import java.util.Scanner;

public class BankCharges {
    public static void main(String[] args) {
        /*
        A bank charges a base fee of $10 per month, plus the following check fees for a commercial
        checking account:

        $.10 each for less than 20 checks
        $.08 each for 20–39 checks
        $.06 each for 40–59 checks
        $.04 each for 60 or more checks

        Write a program that asks for the number of checks written for the month. The program
        should then calculate and display the bank’s service fees for the month
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("How many checks have you written this month? ");
        int numOfChecks = scan.nextInt();

        double fee = 0.0;
        if (numOfChecks < 20){
            fee = numOfChecks * .10;
            System.out.println(fee);
        } else if (numOfChecks >= 20 && numOfChecks <= 39) {
            fee = numOfChecks * 0.08;
            System.out.println(fee);
        } else if (numOfChecks >= 40 && numOfChecks <= 59) {
            fee = numOfChecks * 0.06;
            System.out.println(fee);
        } else {
            fee = numOfChecks * 0.04;
            System.out.println(fee);
        }
    }
}
