package com.perscholas.java_basics.classes.InClassExercises;

public class Human extends LivingThing {

    private String name;

    public void display(){
        System.out.println("MY name is "+ getName());
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void eat(){
        System.out.println("I enjoy pizza");
    }

}
