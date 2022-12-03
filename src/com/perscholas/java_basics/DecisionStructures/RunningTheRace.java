package com.perscholas.java_basics.DecisionStructures;

import java.util.Scanner;

public class RunningTheRace {
    public static void main(String[] args) {
        // Runner names and their time in minutes of finishing, now return it in order...

        Scanner scanRunner = new Scanner(System.in);
        System.out.println("{Enter Runner Name}: ");
        String runnerName1 = scanRunner.nextLine();

        System.out.println("{Enter Runner Name}: ");
        String runnerName2 = scanRunner.nextLine();

        System.out.println("{Enter Runner Name}: ");
        String runnerName3 = scanRunner.nextLine();

        System.out.println("{Enter Runner's Time in Minutes}: ");
        int runnerTime1 = scanRunner.nextInt();

        System.out.println("{Enter Runner's Time in Minutes}: ");
        int runnerTime2 = scanRunner.nextInt();

        System.out.println("{Enter Runner's Time in Minutes}: ");
        int runnerTime3 = scanRunner.nextInt();


        int temp;

        if (runnerTime1 > runnerTime2){
            temp = runnerTime1;
            runnerTime1 = runnerTime2;
            runnerTime2 = temp;
        }
        if (runnerTime1 > runnerTime3){
            temp = runnerTime1;
            runnerTime1 = runnerTime2;
            runnerTime3 = temp;
        }

        // This way, you will ensure that the smallest of the three values
        // is held at name1. Now, compare name2 and name3, and swap them if necessary:

        if (runnerTime2 > runnerTime3){
            temp = runnerTime2;
            runnerTime2 = runnerTime3;
            runnerTime3 = temp;
        }

        System.out.println(runnerTime1 + "\n" + runnerTime2 + "\n" + runnerTime3);
        // prints quickest runner first in minutes followed by second and third place time runners

    }
}
