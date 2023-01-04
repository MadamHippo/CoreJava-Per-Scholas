package com.perscholas.java_basics.classes.JavaPracticeBookQuestions.Chapter6;

import java.util.Scanner;

public class TemperatureMain {
    public static void main(String[] args) {

        // step 1 scanner object
        Scanner scan = new Scanner(System.in);

        // step 2 print out for easy to read
        System.out.println("Enter fTemp: ");

        // step 3: ask for input
        double inputFTemp = scan.nextDouble();

        // step 4: create object instance
        Temperature day1 = new Temperature(inputFTemp);

        // step 5: setting fTemp to inputTemp
        day1.setFahrenheit(inputFTemp);

        // step 6: get and print the temperature format you want:
        System.out.println(day1.getCelsius());
        System.out.println(day1.getFahrenheit());
        System.out.println(day1.getKelvin());

    }
}
