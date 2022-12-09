package com.perscholas.java_basics.classes;
import java.util.Scanner;


/*
Write a method named showChar. The method should accept two arguments: a reference to
a String object and an integer. The integer argument is a character position within the
String, with the first character being at position 0.
When the method executes, it should display the character at that character position.

Here is an example of a call to the method:
showChar("New York", 2);

In this call, the method will display the character w because it is in position 2. Demonstrate
the method in a complete program.
 */


public class showCharMethod {
    public static void main(String[] args) {



        // Instance field variable
        String userWord;
        int index;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        userWord = scan.nextLine();

        System.out.println("Enter desired index: ");
        index = scan.nextInt();

        // Calling the method from main
        showChar(userWord, index);
    }

    // the method accepts 2 arguments...string (userWord) and (index).
    public static void showChar(String string, int i) {
        System.out.println(string.charAt(i));
    }
}
