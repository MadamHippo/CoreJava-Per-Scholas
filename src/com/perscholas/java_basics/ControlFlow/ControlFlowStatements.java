package com.perscholas.java_basics.ControlFlow;

import java.util.Scanner;

public class ControlFlowStatements {
    public static void main(String[] args) {
        // 208.303.2.2 - Practice Assignment - Control Flow (Conditional) Statements

        // question #1:
        /* 1.Write a program that declares 1 integer variable x, and then assigns
        7 to it. Write an if statement to print out “Less than 10” if x is less than 10.
        Change x to equal 15, and notice the result (console should not display anything).
*/
        int x = 15;

        if (x < 10)
            System.out.println("X is less than 10");
        // x was once 7 and printed less than 10. Changing to 15 prints nothing as confirmed
        System.out.println("*******************************");




        // question #2:

        // slight modification y instead of x...

        /*
        2. Write a program that declares 1 integer variable x, and then assigns 7 to it.
        Write an if-else statement that prints out “Less than 10” if x is less than 10, and “Greater than 10”
        if x is greater than 10. Change x to 15 and notice the result.
         */

        int y = 15;

        if (y < 10){
            System.out.println("y is less than 10");
        } else {
            System.out.println("y is greater than 10");
        }

        // when y was 7, the first condition printed. Changing to 15 the second condition prints.
        System.out.println("*******************************");



        // question #3
        /*
        3. Write a program that declares 1 integer variable x, and then assigns 15 to it. Write an if-else-if
        statement that prints out “Less than 10” if x is less than 10; “Between 10 and 20” if x is greater than
        10 but less than 20, and “Greater than or equal to 20” if x is greater than or equal to 20. Change x to
        50 and notice the result.
         */

        // int z = 15;
        int z = 50;

        if (z < 10){
            System.out.println("z is less than 10");
        } else if (z > 10 && z < 20){
            System.out.println("z is between 10 and 20");
        } else {
            System.out.println("z is greater than 20");
        }

        // changing z to 50 will mean the else block prints since its greater than 20
        System.out.println("*******************************");

        // question #4:
        /*
        4. Write a program that declares 1 integer variable x, and then assigns 15 to it. Write an if-else statement that prints
        “Out of range” if the number is less than 10 or greater than 20 and prints
        “In range” if the number is between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the result.
         */

        int variable = 15;
        if ( variable < 10 || variable > 20)
            System.out.println("Out of range");
        else{
            System.out.println("In range");
        }
        // prints “In range” if the number is between 10 and 20 (including equal to 10 or 20).
        // after changing to variable = 5...it becomes "Out of range."

        System.out.println("*******************************");


        // question #5:
        /*5. Write a program that uses if-else-if statements to print out grades
        A, B, C, D, F according to the following criteria

        Use the Scanner class to accept a number score from the user to determine the letter grade.
        Print out “Score out of range” if the score is less than 0 or greater than 100.

        */

        Scanner scan = new Scanner(System.in);
        System.out.print("What was your score?");
        int score = scan.nextInt();

        if (score < 60) {
            System.out.println("Grade F");
        } else if (score < 60 && score > 69) {
            System.out.println("Grade D");
        } else if (score < 70 && score < 79) {
            System.out.println("Grade C");
        } else if (score < 80 && score > 89) {
            System.out.println("Grade B");
        } else if (score < 90 && score > 100) {
            System.out.println("Grade A");
        } else {
            System.out.println("Score out of range.");
        }

        scan.close();
        System.out.println("*******************************");



        // question #6
        /* 6. Write a program that accepts an integer between 1 and 7 from the user. Use a switch statement to
        print out the corresponding weekday. Print “Out of range” if the number is less than 1 or greater than 7.
        Do not forget to include “break” statements in each of your cases.
        */
        Scanner scanWeekDay = new Scanner(System.in);
        System.out.print("Type in integer between 1 -7:");
        int weekDay = scan.nextInt();

        switch (weekDay) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Out of range");
        }
        System.out.println("*******************************");

        // question 7 has been moved to another file named TaxFiling for ease of use and reading.

    }
}
