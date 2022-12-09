package com.perscholas.java_basics.classes.InClassExercises;

public class Student extends Human {
    private double gpa;
    private int id;

    public Student(){

    }


    public double getGpa() {
        return gpa;
    }

    public int getId() {
        return id;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setId(int id) {
        this.id = id;
    }
}
