package com.perscholas.java_basics.lambda;

@FunctionalInterface
public interface AnonymousInterfaceHuman {
    void say();
    // A Single-Abstract-Method


    //------------ default method One---------------------
    default void sleep()
    {
        System.out.println("This is Default Method");
    }

    //------------ Static method -------------------------
    static void communication()
    {
        System.out.println("this is static method");
    }
}
