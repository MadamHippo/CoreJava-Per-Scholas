package com.perscholas.java_basics.classes.JavaPracticeBookQuestions.Chapter6;

public class CarClassMain {
    public static void main(String[] args) {
        CarClass car1 = new CarClass(1999, "Honda", 0);

        car1.brake(40);
        car1.accelerate(20);
        car1.getSpeed();

    }
}
