package com.perscholas.java_basics.classes.JavaPracticeBookQuestions.Chapter10;
import java.util.Scanner;

/*
       Question #3
    When it is complete, the program will ask the user to enter the width and length of a rectangle box, and then
    display
     the rectangle’s area.

     The program calls the following methods, which have not been written:
    •	 getLength—This method should ask the user to enter the rectangle’s length, and then
    return that value as a double.
    •	 getWidth—This method should ask the user to enter the rectangle’s width, and then
    return that value as a double.
    •	 getArea—This method should accept the rectangle’s length and width as arguments, and
    return the rectangle’s area. The area is calculated by multiplying the length by the width.
    •	 displayData—This method should accept the rectangle’s length, width, and area as
    arguments, and display them in an appropriate message on the screen.
     */

public class RectangleAreaPractice {

    // main() is static, therefore it doesn't have direct access to instance state or methods
    public static void main(String[] args) {



        // create a rectangle object and assign its address to the rectangleBox variable
        RectangleAreaPractice rectangleBox = new RectangleAreaPractice();


        // calling object's setLength method and passing user input as an argument.
        rectangleBox.setLength();
        // calling object's setWidth and passing in user input as an argument.
        rectangleBox.setWidth();

        // now print
        System.out.println("The rectangleBox's length is " + rectangleBox.getLength());
        System.out.println("The rectangleBox's width is "+ rectangleBox.getWidth());
        System.out.println("The rectangleBox's area is  " + rectangleBox.getArea());
        // since the setters come before getArea, they will have value set before getArea runs and get area will
        // have access to the instance variables new set values = rectangleBox.getArea();

        rectangleBox.getDisplay();

    }



    // class variables = static
    // if it's not static, it's an instance variable.

    // instance variables is data the class holds. these are private, only methods like get/set can access them.
    private double length;
    private double width;




    // setter method - instance method...? a void method that returns nothing and if there's no static keyword it
    // means it serves to only work on the instance variables
    public void setLength() {
        // method body, assign user input (the argument) passed into the parameter 'len'. 'length' is now
        // assigned from 'len' and referencing to 'len'
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rectangle's length: ");
        length = input.nextDouble();
    }

    // setter method again
    public void setWidth() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rectangle's width: ");
        width = input.nextDouble();
    }


    // getter methods
    public double getLength() {
        return length;
    }

    // another getter method
    public double getWidth()
    {
        return width;
    }


    // another getter method for the area
    public double getArea()
    {
        return length * width;
    }


    // another method
    // displayData—This method should accept the rectangle’s length, width, and area as
    //  arguments, and display them in an appropriate message on the screen.

    public void getDisplay()
    {
        System.out.printf("The box's dimensions are %.2f and %.2f and %.2f", length, width, getArea());
    }

}
