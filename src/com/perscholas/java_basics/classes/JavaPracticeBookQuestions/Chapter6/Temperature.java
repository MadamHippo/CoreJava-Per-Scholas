package com.perscholas.java_basics.classes.JavaPracticeBookQuestions.Chapter6;

public class Temperature {

    double fTemp;


    // constructor:
    Temperature(double fTemp) {
        this.fTemp = fTemp;
    }


    // setter method
    public void setFahrenheit(double newFahrenheit) {
        this.fTemp = newFahrenheit;
    }



    // getter method
    public double getFahrenheit() {
        return fTemp;
    }


    // get celsius
    public double getCelsius() {
        // don't do 5/9 because it's floor division/integer divison. So use a floating point/double in order to
        // divide properly
        double celsius = (5.0/9.0)*(fTemp - 32);
        return celsius;
    }


    // get kelvin
    public double getKelvin() {
        double kelvin = ((5.0/9.0) * (fTemp - 32)) + 273;
        return kelvin;
    }






}
