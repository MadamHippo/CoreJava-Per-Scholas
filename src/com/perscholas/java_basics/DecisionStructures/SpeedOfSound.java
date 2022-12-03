package com.perscholas.java_basics.DecisionStructures;

import java.util.Scanner;

public class SpeedOfSound {
    public static void main(String[] args) {

        // ***NOTES***
        // Comparing strings in Java means you need to use equal...you can't just use == like in python
        //...because == is just comparing pointers pointing to two different instances even if those instances have
        // the same value.
        // whereas .equals all objects have a .equals method and that's the standard way to compare objects. The
        // default one is pointer comparison. Since all classes have their own default .equals, they know themselves
        // better than anyone else so they will have a better compare than == even though its still pointers. When
        // you define your own classes, you will generally use .equals(), .hashcode(), and .compareTo().  Those are
        // the big 3.



        // Question 12....# write a program that ask user to enter type like air or steel etc. and the distance of
        // sound will travel in the medium. The program will need to display and calculate the amount of time it
        // takes sound to travel in the following formulas.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter air, water, or steel: ");
        String type = scanner.nextLine();


        System.out.println("Enter distance as an integer: ");
        int distance = scanner.nextInt();

        double travelAirTime;
        double travelWaterTime;
        double travelSteelTime;


        // String type1 = "boobs";
        // boolean result = type1.equals("air");
        // System.out.println(result);

        if (type.equals("air")){
            travelAirTime = distance / 1100;
            System.out.println(travelAirTime);

        }

        if (type.equals("water")) {
            travelWaterTime = distance / 4900;
            System.out.println(travelWaterTime);
        }

        if (type.equals("steel")) {
            travelSteelTime = distance / 16400;
            System.out.println(travelSteelTime);
        }
    }
}
