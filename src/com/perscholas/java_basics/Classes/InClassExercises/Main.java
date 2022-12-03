// To override, I right click, generate and override methods and choose the methods I want to override.

package com.perscholas.java_basics.Classes.InClassExercises;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();

        // human.setName("Igor)
        human.setName("Igor");

        //display method is inside Human class
        human.display();

        // human.eat() human class inherits from LivingThing class
        human.eat();

        Student student = new Student();

        student.setName("John"+"\n");
        student.setGpa(3.5);
        student.setId(2);

        System.out.println(student.getName() + student.getGpa() + student.getId());
    }
}
