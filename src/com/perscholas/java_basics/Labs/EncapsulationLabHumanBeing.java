package com.perscholas.java_basics.Labs;

public class EncapsulationLabHumanBeing {
    private float weight;
    private float height;
    private float bmi;

    public EncapsulationLabHumanBeing(float weight, float height, float bmi) {
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
    }

    // constructor??
    public EncapsulationLabHumanBeing()
    {

    }

    // getter...
    public float getWeight() {
        return weight;
    }

    // setter
    public void setWeight(float weight)
    {
        this.weight = weight;
    }

    // get height
    public float getHeight()
    {
        return height;
    }

    // set height

    public void setHeight(float height)
    {
        this.height = height;
    }

    // get BMI
    public float getBmi()
    {
        return bmi;
    }

    // set BMI

    public void setBmi(float bmi)
    {
        this.bmi = bmi;
    }

}
