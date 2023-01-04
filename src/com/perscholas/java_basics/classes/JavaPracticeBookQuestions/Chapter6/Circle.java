package com.perscholas.java_basics.classes.JavaPracticeBookQuestions.Chapter6;

public class Circle {

    // fields
    double radius;
    final double PI = 3.14159;

    Circle(double radius) {
        this.radius = radius;
    }

    Circle() {
        this.radius = 0.0;
    }


    // setter
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }


    // getter
    public double getRadius(double radius) {
        return this.radius;
    }

    // getter area

    public double getArea(double radius, double PI) {
        return (this.radius * this.PI);
    }

    // getter diameter
    public double getDiameter(double radius) {
        return this.radius * 2;
    }

    // getter circumference

    public double getCircumference(double radius, double PI) {
        return 2 * PI * radius;
    }

}
