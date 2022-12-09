package com.perscholas.java_basics.variables.CoreJavaPracticeBookQuestions;

import java.util.Scanner;

public class PracticeBookQuestion12 {
    public static void main(String[] args) {
        // String manipulator...

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter favorite city:");
        String favoriteCity = scan.nextLine();
        System.out.println(favoriteCity.length());
        // character count
        System.out.println(favoriteCity.toUpperCase());
        // to upper
        System.out.println(favoriteCity.toLowerCase());
        // to lower
        System.out.println(favoriteCity.charAt(0));
        // first character



    }
}
