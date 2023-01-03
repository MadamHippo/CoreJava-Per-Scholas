package com.perscholas.java_basics.classes.JavaPracticeBookQuestions.Chapter6;

/*
1. Employee Class
Write a class named Employee that has the following fields:
•	 name. The name field references a String object that holds the employee’s name.
•	 idNumber. The idNumber is an int variable that holds the employee’s ID number.
•	 department. The department field references a String object that holds the name of
the department where the employee works.
•	 position. The position field references a String object that holds the employee’s
job title.
The class should have the following constructors:
•	 A constructor that accepts the following values as arguments and assigns them to the
appropriate fields: employee’s name, employee’s ID number, department, and position.
•	 A constructor that accepts the following values as arguments and assigns them to the
appropriate fields: employee’s name and ID number. The department and position
fields should be assigned an empty string ("").
•	 A no-arg constructor that assigns empty strings ("") to the name, department, and
position fields, and 0 to the idNumber field.


The program should store this data in the three objects and then display the data for each
employee on the screen.
 */
public class EmployeeClass {

    // the data that belongs to the class instance:
    String name;
    int idNumber;
    String department;
    String position;

    // constructor with arguments that is based on input
    EmployeeClass(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    // another constructor that accepts the following values as arguments and assigns them to the approiate field:
    EmployeeClass(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        // we do this maybe we don't know their department or position yet but still want to create them an employee
        // entry
        this.department = "";
        this.position = "";
    }

    // No-arg constructor that assigns empty strings ("") to the name, department and position fields and 0 to the
    // idNumber field...
    EmployeeClass() {
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }



    // Write appropriate mutator methods that store values in these fields and accessor methods
    //that return the values in these fields.

    // get and return name:
    public String getName() {
        return name;
    }

    // mutate/set name:
    public void setName(String newName) {
        this.name = newName;
    }


    // get and return idNumber:
    public int getIdNumber() {
        return idNumber;
    }

    // mutate set id num:
    public void setIdNumber(int newIdNum) {
        this.idNumber = newIdNum;
    }

    // get and return department:
    public String getDepartment() {
        return department;
    }

    // setter for department:
    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }

    // get and return position:
    public String getPosition() {
        return position;
    }

    // setter for position;
    public void setPosition(String newPosition) {
        this.position = newPosition;
    }


    // Once you have written the class, write a separate program that creates three Employee objects to hold the
    // following data
}
