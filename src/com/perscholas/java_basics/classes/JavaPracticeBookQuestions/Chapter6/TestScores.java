package com.perscholas.java_basics.classes.JavaPracticeBookQuestions.Chapter6;

public class TestScores {
    int testScore1;
    int testScore2;
    int testScore3;

    //constructor
    TestScores(int testScore1, int testScore2, int testScore3) {
        this.testScore1 = testScore1;
        this.testScore2 = testScore2;
        this.testScore3 = testScore3;
    }

    public void setTestScore1(int testScore1) {
        this.testScore1 = testScore1;
    }

    public void setTestScore2(int testScore2) {
        this.testScore2 = testScore2;
    }

    public void setTestScore3(int testScore3) {
        this.testScore3 = testScore3;
    }

    int averageTestScores() {
        int average = (testScore1 + testScore2 + testScore3);
        average/=3;
        return average;
    }
}
