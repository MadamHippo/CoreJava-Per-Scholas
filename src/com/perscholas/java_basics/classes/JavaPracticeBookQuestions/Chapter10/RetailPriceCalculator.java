package com.perscholas.java_basics.classes.JavaPracticeBookQuestions.Chapter10;

import java.util.Scanner;

public class RetailPriceCalculator {
    /* Write a program that asks the user to enter an item’s wholesale cost and its markup percentage.
    It should then display the item’s retail price.

    For example:
    • If an item’s wholesale cost is 5.00 and its markup percentage is 100 percent, then the
item’s retail price is 10.00.
    • If an item’s wholesale cost is 5.00 and its markup percentage is 50 percent, then the item’s retail price is
     7.50.

     The program should have a method named calculateRetail that receives the wholesale
     cost and the markup percentage as arguments, and returns the retail price of the item.

     */

    // Instance field variables go at top, inside of class and outside of ANY methods. Accessible from any non-static
    // method.

    public static void main(String[] args) {

        // local variables within the main method...they only exist in the main method.
        double wholesalePrice;    //hold user's input for wholesale cost
        double markupPercentage;  //hold user's input for markup

        // the scanner to get user input on wholesalePrice and markup %
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price: ");
        wholesalePrice = scan.nextDouble();
        System.out.println("Enter percentage: ");
        markupPercentage = scan.nextDouble();


        // calling a method
        notice();

        // calling a method
        // since it's the main we are writing return/print statements here!
        double finalRetailPrice = calculateRetail(wholesalePrice, markupPercentage);
        System.out.println(finalRetailPrice);

    }


    // status belongs to the class, not an instances. in this file we don't have an instance...because we're not
    // using a constructor (and we don't need one)

    //  The program should have a method named calculateRetail that receives the wholesale
    // cost and the markup percentage as arguments, and returns the retail price of the item.
    public static double calculateRetail(double discountPrice, double percentage){

        double finalRetailPrice = discountPrice * (percentage/100) + discountPrice;

        return finalRetailPrice;

    }


    // another method for a notice message to customers
    public static void notice(){
        System.out.println("Sale is Final.");
    }
}
