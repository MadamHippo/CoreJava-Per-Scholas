package com.perscholas.java_basics.polymorphism;

/*
Comparing Composition and Inheritance

It is easier to change the class implementing composition than inheritance. The change of a superclass impacts the inheritance hierarchy to subclasses.
You can't add to a subclass a method with the same signature but a different return type as a method inherited from a superclass. Composition, on the other hand, allows you to change the interface of a front-end class without affecting back-end classes.
Composition is dynamic binding (run-time binding) while Inheritance is static binding (compile time binding)
It is easier to add new subclasses (inheritance) than it is to add new front-end classes (composition) because inheritance comes with polymorphism. If you have a bit of code that relies only on a superclass interface, that code can work with a new subclass without change. This is not true of composition unless you use composition with interfaces. Used together, composition and interfaces make a very powerful design tool.
With both composition and inheritance, changing the implementation (not the interface) of any class is easy. The ripple effect of implementation changes remains inside the same class.
Don't use inheritance just to get code reuse If all you really want is to reuse code and there is no is-a relationship in sight, use composition.
Don't use inheritance just to get at polymorphism If all you really want is a polymorphism, but there is no natural is-a relationship, use composition with interfaces.

Summary --

IS-A relationship based on Inheritance, which can be of two types Class Inheritance or Interface Inheritance.
Has-a relationship is composition relationship which is a productive way of code reuse.
 */

public class PolymorphismAndInheritance {

    // given code that calls the classes....
    public static void main(String[] args) {
        // Program at the "interface" defined in the superclass.
        // Declare instances of the superclass, substituted by subclasses.

        // notice the method overwriting of choosing the specific monster attack vs just monster attack
        Monster m1 = new FireMonster("r2u2");   // upcast
        Monster m2 = new WaterMonster("u2r2");  // upcast
        Monster m3 = new StoneMonster("r2r2");  // upcast

        // Invoke the actual implementation
        System.out.println(m1.attack());  // Run FireMonster's attack()
        System.out.println(m2.attack());  // Run WaterMonster's attack()
        System.out.println(m3.attack());  // Run StoneMonster's attack()

        // m1 dies, generate a new instance and re-assign to m1.
        m1 = new StoneMonster("a2b2");  // upcast
        System.out.println(m1.attack());  // Run StoneMonster's attack()

        // We have a problem here!!!
        Monster m4 = new Monster("u2u2");
        System.out.println(m4.attack());  // garbage!!!
    }

    // Monster class
    public static class Monster {

        // Monster constructor because they're making me use a monster name so I can't use the default one...
        // the constructor is called when the object is created. It's  used to initialize instance variables.
        public Monster(String monsterName){
            // why constructor blank
            //.....bc they not use it for anything
        }

        // this is Monster method - its what the monster do...
        public String attack(){
            return "!^_&^$@+%$* I don't know how to attack!";
        }
    }

    // Subclasses that borrow attributes from the parent Monster class
    // and they sub classes have their own constructors because Monster require an argument aka Monster need a
    // non-default constructor.
    // super(monsterName) means...just in case you need to inherit this ability amd set up the state...

    public static class FireMonster extends Monster{

        public FireMonster(String monsterName) {
            super(monsterName);
        }

        public String attack(){
            return "Attack with fire!";
        }
    }

    public static class WaterMonster extends Monster{

        public WaterMonster(String monsterName){
            super(monsterName);
        }
        public String attack(){
            return "Attack with water!";
        }
    }

    public static class StoneMonster extends Monster{
        public StoneMonster(String monsterName){
            super(monsterName);
        }
        public String attack(){
            return "Attack with stones!";
        }
    }
}
