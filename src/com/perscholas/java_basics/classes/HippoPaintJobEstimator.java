package com.perscholas.java_basics.classes;

import java.util.Scanner;

public class HippoPaintJobEstimator {

    static final double HOURLY_LABOR = 18.00;
    static final int HOURS_PER_GALLON = 8;
    static final int SQUARE_FEET_PER_GALLON = 115;

    private double paintPrice;
    private double wallSpace;

    // custom constructor because it shares class name, no return type, they are used to create an instance of the class
    public HippoPaintJobEstimator(double paintPrice, double wallSpace) {
        this.paintPrice = paintPrice;
        this.wallSpace = wallSpace;
    }

    public double calcGallonsPaint() {
        return wallSpace / SQUARE_FEET_PER_GALLON;
    }

    public double calcHoursRequired() {
        return calcGallonsPaint() * HOURS_PER_GALLON;
    }

    public double calcPaintCost() {
        return calcGallonsPaint() * paintPrice;
    }

    public double calcLaborCost() {
        return calcGallonsPaint() * HOURLY_LABOR;
    }

    public double calcTotalCost() {
        return calcPaintCost() + calcLaborCost();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rooms: ");
        int numRooms = input.nextInt();
        input.nextLine();

        System.out.print("Enter paint price per gallon: ");
        double paintPrice = input.nextDouble();
        input.nextLine();

        double totalWallSpace = 0.0;
        for (int i = 0; i < numRooms; i++) {
            System.out.print("Enter wall space in room " + (i+1) + ": ");
            totalWallSpace += input.nextDouble();
            input.nextLine();
        }

        HippoPaintJobEstimator estimator = new HippoPaintJobEstimator(paintPrice, totalWallSpace);

        System.out.println(String.format("Total paint required: %f gallons", estimator.calcGallonsPaint()));
        System.out.println("Hours labor required: " + estimator.calcHoursRequired());
        System.out.println(String.format("Cost of paint: $%.2f", estimator.calcPaintCost()));
        System.out.println(String.format("Cost of labor: $%.2f", estimator.calcLaborCost()));
        System.out.println(String.format("Total cost: $%.2f", estimator.calcTotalCost()));
    }
}
