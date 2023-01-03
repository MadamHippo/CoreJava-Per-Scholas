package com.perscholas.java_basics.classes.JavaPracticeBookQuestions.Chapter6;

public class CarClass {
    int yearModel;
    String make;
    int speed;

    CarClass(int yearModel, String make, int speed) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }

    // accessors

    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    // accelerate method
    void accelerate(int speed) {
        speed+=5;
        System.out.println(speed);
    }

    // break method
    void brake(int speed) {
        speed-=5;
        System.out.println(speed);
    }


}
