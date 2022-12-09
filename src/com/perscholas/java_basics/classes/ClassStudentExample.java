package com.perscholas.java_basics.classes;

import java.util.Scanner;

public class ClassStudentExample {

    // Retail price calculator...from pineapple book.

        /* Write a program that asks the user to enter an item’s wholesale cost and its markup percentage.
    It should then display the item’s retail price.

    For example:
    • If an item’s wholesale cost is 5.00 and its markup percentage is 100 percent, then the
item’s retail price is 10.00.
    • If an item’s wholesale cost is 5.00 and its markup percentage is 50 percent, then the item’s retail price is
     7.50.

     The program should have a method named calculateRetail that receives the wholesale
     cost and the markup percentage as arguments, and returns the retail price of the item.

     */

    public static void main(String[] args) {

        // Fields and these elements of the class
        double wholeSalePrice = 0;
        double markUpPercentage = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter wholesale price: ");
        wholeSalePrice = scan.nextDouble();

        System.out.println("Enter markeup percentage: ");
        markUpPercentage = scan.nextDouble();

        // calling method here...
        messageAdmin();
        message();

        // calling method in main
        double retailPrice = calculateRetail(wholeSalePrice, markUpPercentage);
        System.out.println(retailPrice);

    }


    // public = access identifier, void = return type, setName = name of method, string name = parameter of method
    public static double calculateRetail(double wholesale, double markup) { // <====== wholesale and markup is not
        // the SAME as the variables above.
        // There is no connection between the two!! These 2 are brand new other
        // variables we created as parameters for this method. They BELONG to the method.
        // Not the main method above.
        double retailPrice = wholesale * (markup / 100) + wholesale;

        return retailPrice;
    }


    public static void message() {
        System.out.println("Retail price is... ");
    }

    public static void messageAdmin() {
        System.out.println("Application error thrown contact IT");
    }

}







/*
// this is a keyword in java used to refer to the instance object. We use it because both variables are called the
same thing, we distinguish between the instance variable and the method argument variable. The this keyword refers to
the current object in a method or constructor. The most common use of the this keyword is to eliminate the confusion
between class attributes and parameters with the same name (because a class attribute is shadowed by a method or
constructor parameter). ‘This’ is slightly different in every language, but like Farah said, it differentiates
between that class object(Person) vs the instance object(Ryan)



Local Variables vs Class Instance Field/Variables:

Instance Variable: These variables are declared within a class but outside a method, constructor, or block and
always get a default value. The local variables are stored on a stack, but instance variables are stored on the heap,
so there are some chances that a previous value on the stack will be read instead of a default value as happens in
the heap. For that reason the JVM doesn't allow to use a local variable without initializing it.
If we declare a local variable without an initial value, we'll get an error.
This error occurs only for local variables, since Java automatically initializes the instance variables at
compile time (it sets 0 for integers, false for boolean, etc.).



from the Java book "the term insect describes a very general type of creature with numerous characteristics.
Because grasshoppers and bumblebees are insects, they have general characteristics of an insect aka class variables.
In addition, they have special characteristics of their own. Grasshopper can jump, bumblebees can sting.
These are the instance variables that are unique to each object (grasshopper, bumblebee) that
derives from the insect class."

this is a little advanced but the local variables are stored in the stack memory set. Things placed in the stack memory
set can't be changed. Like how array lengths can't be changed. This is why you have to assign a value to a local
variable. An instance variable is stored in the heap, which is a dynamic memory set where you can change the
contents, like ArrayList

 */