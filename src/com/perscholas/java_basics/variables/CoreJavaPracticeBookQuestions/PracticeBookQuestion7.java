package com.perscholas.java_basics.variables.CoreJavaPracticeBookQuestions;
import java.util.*;

public class PracticeBookQuestion7
{
    public static void main(String[] args) {
        // Sales tax...
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter purchase amount:");
        double purchase_amount = scan.nextDouble();


        double state_sales_tax = 0.04;
        double county_sales_tax = 0.02;

        double answer = purchase_amount * (state_sales_tax + county_sales_tax);
        double total_price = answer + purchase_amount;

        System.out.println(total_price);
    }
}
