package com.perscholas.java_basics.classes.InClassExercises;

public abstract class LivingThing {
    // field and method of the parent class
    private String name;

    public LivingThing(){
    }

    public String getName(){
       return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println("I can eat");
    }

}
