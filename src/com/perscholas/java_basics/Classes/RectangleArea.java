package com.perscholas.java_basics.Classes;
import java.util.Scanner;

    /*
        If you have downloaded the book’s source code from www.pearsonhighered.com/gaddis,
    you will find a partially written program named AreaRectangle.java in this chapter’s
    source code folder. Your job is to complete the program.

    When it is complete, the program will ask the user to enter the width and length of a rectangle, and then display
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


public class RectangleArea
{
    public static void main(String[] args)
    {
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        double length,    // The rectangle's length
                width,     // The rectangle's width
                area;      // The rectangle's area


        // Get the rectangle's length from the user.
        length = getLength();

        // Get the rectangle's width from the user, using the Scanner object that's already been created in Main.
        width = getWidth(keyboard);

        // Get the rectangle's area.
        area = getArea(length, width);

        // Display the rectangle data.
        displayData(length, width, area);

    }

    /**
     The getLength method prompts the user for the rectangle's
     length.
     @return The value entered by the user.
     */

    public static double getLength()
    {
        Scanner consoleIn = new Scanner(System.in);
        double input;        // To hold keyboard input


        System.out.print("Enter the rectangle's length: ");
        input = consoleIn.nextDouble();
        return input;
    }

    /**
     The getWidth method prompts the user for the rectangle's
     width.
     @param consoleIn A Scanner object to use for user input from the console.
     @return The value entered by the user.
     */

    public static double getWidth(Scanner consoleIn)
    {
        double input;        // To hold keyboard input


        System.out.print("Enter the rectangle's width: ");
        input = consoleIn.nextDouble();
        return input;
    }

    /**
     The getArea method calculates a rectangle's area.
     @param length The rectangle's length.
     @param width The rectangle's width.
     @return The area of the rectangle.
     */

    public static double getArea(double length, double width)
    {
        return length * width;
    }

    /**
     The displayData displays a rectanlge's length, width,
     and area, formatted with 1 digit after the decimal point.
     @param length The rectangle's length.
     @param width The rectangle's width.
     @param area The rectangle's area.
     */

    public static void displayData(double length, double width,
                                   double area)
    {
        System.out.printf("Length  = %.1f \nWidth = %.1f \nArea  = %.1f\n",
                length, width, area);
    }
}
