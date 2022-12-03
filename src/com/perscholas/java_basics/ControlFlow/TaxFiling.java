package com.perscholas.java_basics.ControlFlow;

import java.util.Scanner;

public class TaxFiling {
    public static void main(String[] args) {

        // 208.303.2.2 - Practice Assignment - Control Flow (Conditional) Statements

        // question #7:

        /*
        7. Create a program that lets the users input their filing status and income.
        Display how much tax the user would have to pay according to status and income.
         */

        Scanner scanStatus = new Scanner(System.in);
        System.out.print("Type in your filing status: " +
                "1) Single" +
                " 2) Married Filing Jointly AND/OR Qualifying Widower " +
                " 3) Married Filing Separately " +
                " 4) Head of Household");
        int scanFilingStatus = scanStatus.nextInt();

        Scanner scanIncome = new Scanner(System.in);
        System.out.print("Type in your income: ");
        double income = scanIncome.nextDouble();

        if (scanFilingStatus == 1 && income <= 8350 || scanFilingStatus == 2 && income <= 16700 || scanFilingStatus == 3 && income <= 8350 || scanFilingStatus == 4 && income <= 11950){
            System.out.println("Your tax rate is 10%");
        } else if (scanFilingStatus == 1 && income >= 8351 && income <= 33950 || scanFilingStatus == 2 && income >= 16701 && income <= 67900 || scanFilingStatus == 3 && income >= 8351 && income <= 33950 || scanFilingStatus == 4 && income >= 11951 && income <= 45500){
            System.out.println("Your tax rate is 15%");
        } else if (scanFilingStatus == 1 && income >= 33951 && income <= 82250 || scanFilingStatus == 2 && income >= 67901 && income <= 137050 || scanFilingStatus == 3 && income >= 33951 && income <= 68525 || scanFilingStatus == 4 && income >= 45501 && income <= 117450){
            System.out.println("Your tax rate is 25%");
        } else if (scanFilingStatus == 1 && income >= 82251 && income <= 171550 || scanFilingStatus == 2 && income >= 137051 && income <= 208850 || scanFilingStatus == 3 && income >= 68526 && income <= 104425 || scanFilingStatus == 4 && income >= 117451 && income <= 190200){
            System.out.println("Your tax rate is 28%");
        } else if (scanFilingStatus == 1 && income >= 171551 && income <= 372950 || scanFilingStatus == 2 && income >= 208851 && income <= 372950 || scanFilingStatus == 3 && income >= 104426 && income <= 186475 || scanFilingStatus == 4 && income >= 190201 && income <= 372950){
            System.out.println("Your tax rate is 33%");
        }else if (scanFilingStatus == 1 && income >= 372951 || scanFilingStatus == 2 && income >= 372951 || scanFilingStatus == 3 && income >= 186476 || scanFilingStatus == 4 && income >= 372951){
            System.out.println("Your tax rate is 35%");
        }

        System.out.println("*******************************");
    }
}
