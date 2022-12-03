package com.perscholas.java_basics.Classes;

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
    public static void main(String[] args) {

        // Instance field variables

        double wholesalePrice = 0;    //hold user's input for wholesale cost
        double markupPercentage = 0; //hold user's input for markup

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price: ");
        wholesalePrice = scan.nextDouble();
        System.out.println("Enter percentage: ");
        markupPercentage = scan.nextDouble();


        double finalRetailPrice = calculateRetail(wholesalePrice, markupPercentage);
        System.out.println(finalRetailPrice);

    }


    //  The program should have a method named calculateRetail that receives the wholesale
    // cost and the markup percentage as arguments, and returns the retail price of the item.
    public static double calculateRetail(double discountPrice, double percentage){

        double finalRetailPrice = discountPrice * (percentage/100) + discountPrice;

        return finalRetailPrice;

    }


    public void notice(){
        System.out.println("Sale is Final.");
    }
}
