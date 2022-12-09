package com.perscholas.java_basics.variables.CoreJavaPracticeBookQuestions;

import java.util.Scanner;

public class PracticeBookQuestion8
{
    public static void main(String[] args) {
        // Cookie calories...how many calories per cookie?? Based on scanner of how much you ate...


        int cookie_count_per_bag = 40;
        int serving_per_bag = 10;
        int one_serving = 300;
        // so total bag is 1200 calories I think?
        // 4 cookies per serving. Each cookie is 75 calories.

        Scanner scan = new Scanner(System.in);
        System.out.println("How many cookies you ate:");
        int how_many_cookies = scan.nextInt();

        int calories_per_cookie = one_serving / (cookie_count_per_bag / serving_per_bag);
        // so total bag is 1200 calories I think?
        // 4 cookies per serving. Each cookie is 75 calories.


        System.out.println(how_many_cookies * calories_per_cookie);

    }
}
