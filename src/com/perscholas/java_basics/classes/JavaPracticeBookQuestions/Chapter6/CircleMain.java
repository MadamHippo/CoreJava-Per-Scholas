package com.perscholas.java_basics.classes.JavaPracticeBookQuestions.Chapter6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {

        // write a program that demonstrates the Circle class by asking the user for the circles' radius, creating Circle
        // object, and then reporting the circle's area, diameter, circumference

        Scanner scan = new Scanner(System.in); // create a scanner object

        System.out.println("Enter your radius: ");

        double inputRadius = scan.nextDouble();

        Circle shape = new Circle(inputRadius);

        System.out.println("Circumference: " + shape.getCircumference(inputRadius, shape.PI));

        System.out.println("Area: " + shape.getArea(inputRadius, shape.PI));

        System.out.println("Diameter: " + shape.getDiameter(inputRadius));

    }

}
