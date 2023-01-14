package com.perscholas.java_basics.classes.JavaPracticeBookQuestions.Chapter6;

// this whole problem is an example of Encapsulation...

public class MonthDays {

    int month;
    int year;

    // constructor
    MonthDays(int month, int year) {
        this.month = month;
        this.year = year;
    }

    // method
    public int getNumberOfDays() {

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 8:
            case 10:
            case 12:
                System.out.println("This is how many days there are that month:");
                return + 31;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                System.out.println("This is how many days there are that month:");
                return 30;
            case 2:
                // is it a leap year?
                if (month % 400 == 0) {
                    System.out.println("This is how many days there are that month:");
                    return 29;
                } else if (month % 4 == 0 && month % 100 != 0) {
                    System.out.println("This is how many days there are that month:");
                    return 29;
                } else {
                    // num of days in Feb when it's not a leap year
                    System.out.println("This is how many days there are that month:");
                    return 28;
                }
        }
        return -1;
    }

}
