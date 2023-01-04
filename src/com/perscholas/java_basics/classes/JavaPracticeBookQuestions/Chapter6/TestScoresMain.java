package com.perscholas.java_basics.classes.JavaPracticeBookQuestions.Chapter6;

import java.util.Scanner;

public class TestScoresMain {
    public static void main(String[] args) {

        // step 1: create scanner and fill out scanner to take & read all inputs

        Scanner scan = new Scanner(System.in);
        System.out.println("What's your first test score?");
        int inputTest1 = scan.nextInt();

        System.out.println("What's your second test score?");
        int inputTest2 = scan.nextInt();

        System.out.println("What's your third test score?");
        int inputTest3 = scan.nextInt();


        // step 2: create an instance of an object
        TestScores studentA = new TestScores(inputTest1, inputTest2, inputTest3);

        studentA.setTestScore1(inputTest1);
        studentA.setTestScore2(inputTest2);
        studentA.setTestScore3(inputTest3);

        System.out.println(studentA.averageTestScores());


    }
}
