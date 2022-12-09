package com.perscholas.java_basics.decisionstructures;

import java.util.Scanner;

public class SoftwareSales {
    public static void main(String[] args) {
        int softwarePrice = 99;
        Scanner scan = new Scanner(System.in);
        System.out.println("Next price: ");
        int softwareCount = scan.nextInt();

        double customerPrice = softwareCount * softwarePrice;
        double discount = customerPrice;

        if (softwareCount <= 10){
            System.out.println(customerPrice);
            // 9 order is $891 (no discount)
            
        } else if (softwareCount >= 10 && softwareCount <= 19) {
            customerPrice = customerPrice - (discount * 0.20);
            System.out.println(customerPrice);
            // 10 orders is $792 (20% off)

        } else if (softwareCount >= 20 && softwareCount <= 49) {
            customerPrice = customerPrice - (discount * 0.30);
            System.out.println(customerPrice);
            // if input is 22 then total price is $1524.60 (aka 30% off)

        } else if (softwareCount >= 50 && softwareCount <= 99) {
            customerPrice = customerPrice - (discount * 0.40);
            System.out.println(customerPrice);

        } else if (softwareCount >= 100) {
            customerPrice = customerPrice - (discount * 0.50);
            System.out.println(customerPrice);
        }
    }
}
