package com.perscholas.java_basics.variables.CoreJavaPracticeBookQuestions;

import java.util.Scanner;

public class PracticeBookQuestion18 {
    public static void main(String[] args) {
        // Word games...

        Scanner scan = new Scanner(System.in);

        System.out.println("What's your name:");
        String myName = scan.nextLine();

        System.out.println("What's your age:");
        // String myAge = scan.nextLine();
        // didn't work as int...because it wouldn't go to end of line...so next time you read line it reads you the blank line...I think that's whats happening
        // could bypass with parseInt() I think

        // Another method:
        // int myAge = scan.nextInt();
        // scan.nextLine();


        int myAge = Integer.parseInt(scan.nextLine());

        System.out.println("Where do you live:");
        String myCity = scan.nextLine();

        System.out.println("Where do you go to school:");
        String myCollege = scan.nextLine();

        System.out.println("Where do you work:");
        String myJob = scan.nextLine();

        System.out.println("What's your favorite animal:");
        String myAnimal = scan.nextLine();

        System.out.println("What's your pet's name?:");
        String myPetName = scan.nextLine();

        String response = String.format("There once was a person named %s who lived in %s. At the age of %d, %s went to college at %s. %s graduated and went to work as a %s. Then %s adopted an %s named %s. They both lived happily ever after!", myName, myCity, myAge, myName, myCollege, myName, myJob, myName, myAnimal, myPetName);
        System.out.println(response);

    }
}
