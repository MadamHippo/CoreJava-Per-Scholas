package com.perscholas.java_basics.DecisionStructures;

import java.util.Scanner;

public class BookClubPoints {
    public static void main(String[] args) {
        /*
        Serendipity Booksellers has a book club that awards points to its customers based on the
        number of books purchased each month. The points are awarded as follows:
        •	 If a customer purchases 0 books, he or she earns 0 points.
        •	 If a customer purchases 1 book, he or she earns 5 points.
        •	 If a customer purchases 2 books, he or she earns 15 points.
        •	 If a customer purchases 3 books, he or she earns 30 points.
        •	 If a customer purchases 4 or more books, he or she earns 60 points.
        Write a program that asks the user to enter the number of books that he or she has purchased this month and then displays the number of points awarded.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("How many books did you purchase this month? ");
        int numOfBooks = scan.nextInt();

        double points = 0.0;
        if (numOfBooks <= 0){
            System.out.println(points);
        } else if (numOfBooks == 1) {
            points = 5.0;
            System.out.println(points);
        } else if (numOfBooks == 2) {
            points = 15.0;
            System.out.println(points);
        } else if (numOfBooks == 3) {
            points = 30.0;
            System.out.println(points);
        } else if (numOfBooks >= 4) {
            points = 60.0;
            System.out.println(points);
        }
    }
}
