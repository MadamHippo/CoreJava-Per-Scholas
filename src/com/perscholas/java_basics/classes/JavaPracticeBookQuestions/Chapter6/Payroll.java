package com.perscholas.java_basics.classes.JavaPracticeBookQuestions.Chapter6;

public class Payroll {

    // field
    String employeeName;
    String idNum;
    double hourlyRate;
    int hoursWorked;

    // constructor
    Payroll(String employeeName, String idNum) {
        this.employeeName = employeeName;
        this.idNum = idNum;
    }


    // getter and setter

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    // method that returns employees gross pay --

    double grossPay() {
        return hourlyRate * hoursWorked;
    }

}
