package com.perscholas.java_basics.lambda;

// Functional Interface - Anonymous Implementation Class
public class Main {
    public static void main(String[] args) {
        NormalClass mObj = new NormalClass();
        mObj.anonymousInterfaceHumanObject1.say();
        mObj.anonymousInterfaceHumanObject2.say();
        // Output:
        // I am Ironman.
        //I am Tony

        mObj.anonymousInterfaceHumanObject1.sleep();
        mObj.anonymousInterfaceHumanObject2.sleep();



    }
}
