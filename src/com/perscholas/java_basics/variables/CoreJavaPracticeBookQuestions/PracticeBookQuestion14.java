package com.perscholas.java_basics.variables.CoreJavaPracticeBookQuestions;

import java.util.Scanner;

public class PracticeBookQuestion14 {
    public static void main(String[] args) {
        // gender ratio in class...

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter male count:");
        int maleCount = scan.nextInt();

        System.out.println("Enter female count:");
        int femaleCount = scan.nextInt();

        double totalStudent = femaleCount + maleCount;
        double malePercentage = (maleCount / totalStudent)*100;
        System.out.println("Male:" + malePercentage);

        double femalePercentage = (femaleCount / totalStudent)*100;
        System.out.println("Female" + femalePercentage);

    }
}
