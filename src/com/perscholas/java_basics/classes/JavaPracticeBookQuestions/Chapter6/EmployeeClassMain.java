package com.perscholas.java_basics.classes.JavaPracticeBookQuestions.Chapter6;

public class EmployeeClassMain {

    public static void main(String[] args) {
        // Once you have written the class, write a separate program that creates three Employee objects to hold the
        // following data

        // className object = new className();
        EmployeeClass employee1 = new EmployeeClass("Susan Meyers", 47899, "Accounting", "Vice President");
        EmployeeClass employee2 = new EmployeeClass("Mark Jones", 39119, "IT", "Programmer");
        EmployeeClass employee3 = new EmployeeClass("Joy Rogers", 81774, "Manufacturing", "Engineer");


        employee3.getName();
        System.out.println(employee3.name);
        employee3.setName("Emily Rogers");
        System.out.println(employee3.name);
    }
}
