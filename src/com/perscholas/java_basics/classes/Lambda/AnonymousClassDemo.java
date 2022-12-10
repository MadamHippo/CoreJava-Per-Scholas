package com.perscholas.java_basics.classes.Lambda;
import java.util.Scanner;

public class AnonymousClassDemo {

    public static void main(String[] args) {

        /*
        Syntax for instantiation an anonymous inner class:
        new ClassOrInterfaceName() {
              (Fields and methods of the anonymous class…)
              }
         */
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        int userNum;

        // Create an object that implements IntCalculator.
        IntCalculator square = new IntCalculator(){
            public int calculate(int number){
                return number*number;
            }};

        // Get a number from user.
        System.out.println("Enter an integer number");
        userNum = keyboard.nextInt();

        // Display the square of the number.
        System.out.println("The square is " + square.calculate(userNum));
    }
}
