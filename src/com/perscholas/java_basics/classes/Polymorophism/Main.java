package com.perscholas.java_basics.classes.Polymorophism;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeSound();

        Animal pig = new Pig();
        pig.makeSound();

        Animal cat = new Cat();
        cat.makeSound();

        Animal dog = new Dog();
        dog.makeSound();
    }

}