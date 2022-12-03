package com.perscholas.java_basics.DecisionStructures;

import java.util.Scanner;

public class FatGramCalculator {
    public static void main(String[] args) {
        // question 10 in pineapple book...
        // have user enter in calorie and fat grams in food item

        Scanner scanCalorie = new Scanner(System.in);
        System.out.println("{Enter Food Item Calorie}: ");
        int foodCalorie = scanCalorie.nextInt();

        Scanner scanFat = new Scanner(System.in);
        System.out.println("{Enter Food Item Fat Grams}: ");
        int foodFatGram = scanFat.nextInt();

        double caloriesFromFat = foodFatGram * 9;
        double percentageFat = caloriesFromFat / foodCalorie;

        if (foodFatGram > foodCalorie){
            System.out.println("Input is invalid");
        }

        if (percentageFat <= 0.30){
            System.out.println("This food is low in fat: " + percentageFat);
        } else if (percentageFat >= 0.30 && foodFatGram < foodCalorie) {
            System.out.println(percentageFat);
        }
    }
}
