package com.perscholas.java_basics.decisionstructures;

import java.util.Scanner;

public class ShippingCharges {
    public static void main(String[] args) {
        // shipping charges and calculate the shipping rates
        
        double shipRateXS = 1.10;
        double shipRateS = 2.20;
        double shipRateM = 3.70;
        double shipRateL = 3.80;

        Scanner scan = new Scanner(System.in);
        System.out.println("{Enter Package Weight in Lbs}: ");
        int packageWeightLbs = scan.nextInt();
        
        if (packageWeightLbs <= 2){
            System.out.println(shipRateXS);
        } else if (packageWeightLbs >= 2 && packageWeightLbs <= 6) {
            System.out.println(shipRateS);
        } else if (packageWeightLbs >= 6 && packageWeightLbs <= 10) {
            System.out.println(shipRateM);
        } else if (packageWeightLbs >= 10) {
            System.out.println(shipRateL);
        }


    }
}
