package com.perscholas.java_basics.Polymorphism;

public class PolymorphismAndInheritance {

    // given code that calls the classes....
    public static void main(String[] args) {
        // Program at the "interface" defined in the superclass.
        // Declare instances of the superclass, substituted by subclasses.
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
