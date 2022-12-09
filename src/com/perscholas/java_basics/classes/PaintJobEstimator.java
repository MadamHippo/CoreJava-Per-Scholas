package com.perscholas.java_basics.classes;
import java.util.Scanner;

/*
    A painting company has determined that for every 115 square feet of wall space, one gallon
    of paint and 8 hours of labor will be required. The company charges $18.00 per hour
    for labor. Write a program that allows the user to enter the number of rooms to be painted
    and the price of the paint per gallon. It should also ask for the square feet of wall space in
    each room. The program should have methods that return the following data:
    •	 The number of gallons of paint required
    •	 The hours of labor required
    •	 The cost of the paint
    •	 The labor charges
    •	 The total cost of the paint job
    Then it should display the data on the screen.
 */

public class PaintJobEstimator {

    // default privacy is 'package private' aka default
    // Class variables that belong to the class.
    // Global Constants ////////////////////////////////////////////////////////////////////////////////////////

    static final double HOURLY_LABOR = 18.00;
    static final int HOURS_PER_GALLON = 8;
    static final int SQUARE_FEET_PER_GALLON = 115;

    public static void main(String[] args) {

        PaintJobEstimator job1 = new PaintJobEstimator();


        int rooms = job1.getNumOfRooms();
        double wallSpace = job1.getWallSpacePerRoom();
        double totalGallons = job1.getGallonRequired();
        double costOfLabor = job1.getCostOfLabor();
        double paintPrice = job1.getPaintPrice();
        double hoursOfLabor = job1.calculateHoursOfLabor();


        System.out.printf("The client has %s rooms, %s total wall space in square feet with a requirement of %s total" +
                        " gallons of paint needed at %s" +
                " per paint can price. That means the total cost is to be %s because there is a total %s hours of " +
                        "labor.", rooms,
                wallSpace, totalGallons,
                paintPrice, costOfLabor, hoursOfLabor);

        double totalCost = job1.calculateTotalCost();
        System.out.println("\n Total cost: " + "\n" + totalCost);
    }


    // instance variables
    int rooms;
    double totalWallSquareFeet;
    // double numSquareFeet;
    double paintPricePerGallon;
    double gallonRequired;
    double costOfLabor;



    // User to enter the number of rooms to be painted:
    public int getNumOfRooms()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rooms: ");
        rooms = input.nextInt();
        return rooms;
    }



    // Get user to put in wall square feet per room:
    public double getWallSpacePerRoom()
    {
        totalWallSquareFeet = 0;
        for (int i=0; i<rooms; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter square feet of wall space in each room: ");
            totalWallSquareFeet += input.nextDouble();

        }
        return totalWallSquareFeet;
    }


    // get gallon of paint required:
    public double getGallonRequired()

    {
        gallonRequired = (totalWallSquareFeet / SQUARE_FEET_PER_GALLON);
        return gallonRequired;

    }

    // get cost of paint per gallon from user:
    // and how many gallons they require...
    public double getPaintPrice()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of the paint per gallon: ");
        paintPricePerGallon = input.nextDouble();
        input.nextLine();
        return paintPricePerGallon * gallonRequired;
    }


    // how many hours of labor do you need?
    public double calculateHoursOfLabor()
    {
        return gallonRequired / HOURS_PER_GALLON;
    }


    // get cost of labour required:
    public double getCostOfLabor()
    {
        costOfLabor = (gallonRequired * HOURLY_LABOR);
        return costOfLabor;
    }


    //  total cost?!
    public double calculateTotalCost()
    {
        return (paintPricePerGallon * gallonRequired) + costOfLabor;

    }




}
