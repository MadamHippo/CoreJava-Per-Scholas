package com.perscholas.java_basics.exceptions;

public class ExceptionPractice {
    /*
    try
    {
     (try block statements . . .)
    }
    catch (ExceptionType parameterName)
    {
     (catch block statements . . .)
    }
    System.out.println("Successfully done.");
    ^^^
    If no exception is thrown in the try block, the program jumps to the statement that
    immediately follows the try/catch construct.


   "catch (FileNotFoundException e)" means...this catch clause declares a reference variable named e as its parameter.
   The e variable can reference an object of the error class...and the code in the catch block will execute.
   After the catch block is executed, the program will resume with the code that appears after the
   entire try/catch construct.

   The Java API documentation lists all of the exceptions that can be thrown from each method.
     */


    public static void main(String[] args) {
        String str = "abcde";
        int number;

        try
        {
            number = Integer.parseInt(str);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Conversion error: " + e.getMessage());
            // prints out "Conversion error: For input string: "abcde""
            // When handling exceptions, you can use a polymorphic reference as a parameter in the catch clause.
        }
        finally
        {
            // (finally block statements . . .)
        }

        // Although the Integer class’s parseInt method throws a NumberFormatException object,
        //this code still works because the NumberFormatException class inherits from the
        //Exception class
    }
}



/*
Code Listing 11-5 (SalesReport.java)
 1 import java.io.*; // For File class and FileNotFoundException
 2 import java.util.*; // For Scanner and InputMismatchException
 3 import javax.swing.JOptionPane; // For the JOptionPane class
 4
 5
 6 This program demonstrates how multiple exceptions can
 7 be caught with one try statement.
 8
 9
         public class SalesReport
         {
        public static void main(String[] args)
        {
        String filename = "SalesData.txt"; // File name
        int months = 0; // Month counter
        double oneMonth; // One month's sales
        double totalSales = 0.0; // Total sales
        double averageSales; // Average sales

       try
       {
       // Open the file.
       File file = new File(filename);
       Scanner inputFile = new Scanner(file);

        // Process the contents of the file.
        while (inputFile.hasNext())
        {
        // Get a month's sales amount.
        oneMonth = inputFile.nextDouble();

        // Accumulate the amount.
        totalSales += oneMonth;
        Increment the month counter
        36 months++;
        }

        / Close the file.
        inputFile.close();


        Calculate the average.
        averageSales = totalSales / months;

        // Display the results.
        JOptionPane.showMessageDialog(null,
        String.format("Number of months: %d\n" +
        "Total Sales: $%,.2f\n" +
        "Average Sales: $%,.2f", (months, totalSales, averageSales));
        }
        catch(FileNotFoundException e)
        {
        // Thrown by the Scanner constructor when
        // the file is not found.
        JOptionPane.showMessageDialog(null,
        "The file " + filename + " does not exist.");
        }
        catch(InputMismatchException e)
        {
        // Thrown by the Scanner class's nextDouble
        // method when a non-numeric value is found.
        Handling Exceptions 715
        JOptionPane.showMessageDialog(null,
        "Non-numeric data found in the file.");
        }

        System.exit(0);
        }
       }
 */