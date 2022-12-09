package com.perscholas.java_basics.decisionstructures;

import java.util.Scanner;

public class MassAndWeight {
    public static void main(String[] args) {
        // Scientist measure an object's mass in kilos and its weight in Newtons. If you know
        // mass of object then you can calculate the weight in Newtons with this formula:
        // weight = mass x 9.8
        // write a program that lets the user calculate its weight from mass they enter.
        // With a control for if it's too heavy or too light.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter item Mass: ");
        double mass = scan.nextDouble();

        double weight = mass*9.8;
        if (weight > 1000){
            System.out.println("Too heavy..." + weight);
        } else if (weight < 10) {
            System.out.println("Too light" + weight);
        } else {
            System.out.println("Just right..." + weight);
        }


    }
}
