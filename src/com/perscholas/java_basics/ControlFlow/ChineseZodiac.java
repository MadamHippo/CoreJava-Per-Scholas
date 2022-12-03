package com.perscholas.java_basics.ControlFlow;

public class ChineseZodiac {
    /* Write a program that prompts the user to enter a year, and display the animal for the year.

    Note that year % 12 determines the Zodiac sign. 1900 is the year of the rat because 1900 % 12 is 4.
    Listing 3.10 gives a program that prompts the user to enter a year and displays the animal for the year

     */

    public static void main(String[] args) {
        int year = 2022;
        switch (year % 12)
        {   case 0: System.out.println("monkey"); break;
            case 1: System.out.println("rooster"); break;
            case 2: System.out.println("dog"); break;
            case 3: System.out.println("pig"); break;
            case 4: System.out.println("rat"); break;
            case 5: System.out.println("ox"); break;
            case 6: System.out.println("tiger"); break;
            case 7: System.out.println("rabbit"); break;
            case 8: System.out.println("dragon"); break;
            case 9: System.out.println("snake"); break;
            case 10: System.out.println("horse"); break;
            case 11: System.out.println("sheep");
        }
    }


}
