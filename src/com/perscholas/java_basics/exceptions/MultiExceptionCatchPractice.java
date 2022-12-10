package com.perscholas.java_basics.exceptions;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class MultiExceptionCatchPractice {


/*
 This program demonstrates how multiple exceptions can
 be caught with a single catch clause.
*/
    public static void main(String[] args) {
        int number; // To hold a number from the file

        try {
            // Open the file
            File file = new File("Numbers.txt");
            Scanner inputFile = new Scanner(file);

            // Process the contents of the file.
            while (inputFile.hasNext()) {
                // Get a number from the file.
                number = inputFile.nextInt();

                // Display the number.
                System.out.println(number);
            }

            // Close the file.
            inputFile.close();

        } catch (FileNotFoundException | InputMismatchException ex) {

            // Display an error message.
            System.out.println("Error processing the file.");
        }
    } // . If the main method does not handle the exception,
    // then the program is halted and the default exception handler handles the exception.
}
/*
In Java, there are two categories of exceptions: unchecked and checked. Unchecked exceptions are those that inherit from the Error class or the RuntimeException class. Recall that
the exceptions that inherit from Error are thrown when a critical error occurs, such as running out of memory. You should not handle these exceptions because the conditions that
cause them can rarely be dealt with in the program.

All of the remaining exceptions (that is, those that do not inherit from Error or
RuntimeException) are checked exceptions. These are the exceptions that you should handle
in your program.
 */