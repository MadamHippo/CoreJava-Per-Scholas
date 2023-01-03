package com.perscholas.java_basics.classes.JavaPracticeBookQuestions.Chapter6;
// write a class that holds data about item in a retail store. the class should have description, units on hand, and
// price.

public class RetailItem {

    //fields
    String description;
    int unitsOnHand;
    double price;


    // constructor
    RetailItem(String description, int unitsOnHand, double price) {
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }



    // getter

    public String getDescription() {
        return description;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public double getPrice() {
        return price;
    }



    // setter

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
