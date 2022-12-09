package com.perscholas.java_basics.inheritance;

// Navigate >> Type Hierarchy >> and you'll see the orders of them.

public class EncapsulationLabMain {
    public static void main(String[] args) {

        EncapsulationLabHumanBeing human1 = new EncapsulationLabHumanBeing();
        // using setters of human being
        human1.setHeight(1.65f);
        human1.setWeight(68);
        human1.setBmi(calculateBmi(human1));

        // using getters
        System.out.println("Person has "+human1.getWeight()+" kgs and is "+ human1.getHeight()+" meters in height."+
                "BMI is "+human1.getBmi());

    }

    public static float calculateBmi(EncapsulationLabHumanBeing human1)
    {
        return human1.getWeight()/(human1.getHeight()* human1.getHeight());
    }
    // Person has 68.0 kgs and is 1.65 meters in height, which results in BMI of 24.977045
}
