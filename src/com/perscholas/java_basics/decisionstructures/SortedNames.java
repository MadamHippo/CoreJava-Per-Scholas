package com.perscholas.java_basics.decisionstructures;

import java.util.Scanner;

public class SortedNames {
    public static void main(String[] args) {
        /* Problem #7 - Sorted names:
        Display the names sorted in ascending order...
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name1 = scan.nextLine();
        System.out.println("Enter a name again: ");
        String name2 = scan.nextLine();
        System.out.println("Enter a name again, again: ");
        String name3 = scan.nextLine();

        // not allowed to use loops or arrays since we have not covered that in class.
        char char1 = name1.charAt(0);
        char char2 = name2.charAt(0);
        char char3 = name3.charAt(0);

        // To keep things simple, there's one rule:
        // You cannot simply "swap" the values. You'll need
        // a temporary variable to hold the values you are swapping:

        char temp;

        //Now, the comparisons. The way I would tackle this is by comparing the first
        // name with the second and third name, and make the necessary swaps:

        if (char1 > char2){
            temp = char1;
            char1 = char2;
            char2 = temp;
        }
        if (char1 > char3){
            temp = char1;
            char1 = char3;
            char3 = temp;
        }

        // This way, you will ensure that the smallest of the three values
        // is held at name1. Now, compare name2 and name3, and swap them if necessary:

        if (char2 > char3){
            temp = char2;
            char2 = char3;
            char3 = temp;
        }
        System.out.println(char1 + "\n" + char2 + "\n" + char3);

    }
}


/*

import java.util.Scanner;  // Needed for User Input

public static void main(String[] args)
{

    String name1;
    String name2;
    String name3;

    Scanner keyboard = new Scanner(System.in);
    System.out.print("Please Enter First Name ");
    name1=keyboard.nextLine();
    System.out.print("Please Enter Second Name ");
    name2=keyboard.nextLine();
    System.out.print("Please Enter Third Name ");
    name3=keyboard.nextLine();

    if((name1.compareTo(name2) < 0) && (name1.compareTo(name3) < 0))
        {
            System.out.println(name1);
            if (name2.compareTo(name3) < 0)
            {
                System.out.println(name2);
                System.out.println(name3);
            }
            else
            {
                System.out.println(name3);
                System.out.println(name2);
            }
        }
    else if((name1.compareTo(name2) > 0) && (name2.compareTo(name3) < 0))
        {
            System.out.println(name2);
            if (name1.compareTo(name3) < 0)
            {
                System.out.println(name1);
                System.out.println(name3);
            }
            else
            {
                System.out.println(name3);
                System.out.println(name1);
            }
        }
    else
        {
        System.out.println(name3);
            if (name1.compareTo(name2) < 0)
            {
                System.out.println(name1);
                System.out.println(name2);
            }
            else
            {
                System.out.println(name2);
                System.out.println(name1);
            }
        }

}

 */
