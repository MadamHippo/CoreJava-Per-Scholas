package com.perscholas.java_basics.Generics;

// The idea of generics is to create a single class that automatically works with different types of data

// element  = contents of an array

public class genericsPractice {


    public static void main(String[] args) {

        // invoking the generics method below...
        genericsPractice dObj = new genericsPractice();
        dObj.genericsMethod(25); // passing int
        dObj.genericsMethod("Per Scholas"); // passing String
        dObj.genericsMethod(2563.5); // passing float
        dObj.genericsMethod('H'); // passing Char
    }


    // create generics method:
    public <T> void genericsMethod(T data){
                        //     We can call the generics method by placing the actual type <String> and <Integer> inside the bracket
                        //     before the method name.
        System.out.println("Generics Method");
        System.out.println("Data Passed: " + data);
    }

    /*
    In the above example, we have created a generic method named genericsMethod.
        public <T> void genericMethod(T data) {...}
    Here, the type parameter <T> is inserted after the public modifier and before the return type void.
    We can call the generics method by placing the actual type <String> and <Integer> inside the bracket before the method name.
     */


}
