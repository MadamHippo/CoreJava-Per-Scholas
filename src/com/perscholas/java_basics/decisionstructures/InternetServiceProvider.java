package com.perscholas.java_basics.decisionstructures;

import java.util.Scanner;

public class InternetServiceProvider {
    public static void main(String[] args) {


        /* Question #13:

        an ISP has 3 different subscription packages for its customers: calculate user's bill
        Package A: For $9.95 per month 10 hours of access are provided. Additional hours
        are $2.00 per hour.
        Package B: For $13.95 per month 20 hours of access are provided. Additional hours
        are $1.00 per hour.
        Package C: For $19.95 per month unlimited access is provided

        */


        /* Question #14:
        Internet Service Provider, Part 2 -- Modify the program you wrote for Programming Challenge 13 so it also
        calculates and displays the amount of money Package A customers would save if they purchased Package
        B or C, and the amount of money Package B customers would save if they purchased Package C.
        If there would be no savings, no message should be printed.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("What's your internet package? (A, B, C) ");
        String packageType = scan.nextLine();
        System.out.println("How many numbers of hours you were online? ");
        int hoursUsed = scan.nextInt();


        double customerBill = 0.0;
        if (packageType.equals("A") || hoursUsed <= 10){
            double packagePrice = 9.95;
            customerBill = packagePrice + (hoursUsed * 2);
            System.out.println(customerBill);

            if (hoursUsed >= 10){
                double savings = 19.95;
                String message = String.format("Your package type is %s, it cost you %d right now...but your savings will be %d", packageType, customerBill, savings);
                System.out.println(message);
            }

        } else if (packageType.equals("B") || hoursUsed <= 20) {
            double packagePrice = 13.95;
            customerBill = packagePrice + (hoursUsed * 1);
            System.out.println(customerBill);


        } else if (packageType.equals("C") && hoursUsed > 20) {
            double packagePrice = 19.95;
            System.out.println(packagePrice);
        }




    }
}
