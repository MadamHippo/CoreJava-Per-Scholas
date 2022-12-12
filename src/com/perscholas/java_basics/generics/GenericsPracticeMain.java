package com.perscholas.java_basics.generics;

// The idea of generics is to create a single class that automatically works with different types of data

// element  = contents of an array

public class GenericsPracticeMain {


    public static void main(String[] args) {

        // invoking the generics method below...
        GenericsPracticeMain dObj = new GenericsPracticeMain();
        System.out.println( "=== invoking regular generic method ========" );
        dObj.genericsMethod(25); // passing int
        dObj.genericsMethod("Per Scholas"); // passing String
        dObj.genericsMethod(2563.5); // passing float
        dObj.genericsMethod('H'); // passing Char


        // invoking the generics CLASS static method below...
        System.out.println( "=== invoking static method generic ========" );
        GenericsPracticeMain.staticGeneric(254);
        GenericsPracticeMain.staticGeneric("Java Developer");
        GenericsPracticeMain.staticGeneric(254.59595959595959);


        // In this example, we will invoke the generics with static method below...
        Integer[] intArray = { 10, 20, 30, 40, 50 };
        Character[] charArray = { 'J', 'A', 'V', 'A'};
        System.out.println("Printing Integer Array");
        GenericsPracticeMain.printArray(intArray);
        // @hippo this is printing memory...the slide xample didn't work?
        GenericsPracticeMain.printArray(charArray);

        // initialize generic class again with Integer Data
        // Dealing with GenericsClass.java - invoke the generics in that Class file...
        GenericsClass<Integer> intObject = new GenericsClass<>(5);
        System.out.println("Generic Class returns: " + intObject.getData());

        // initialize generic class again with String Data
        GenericsClass<String> stringObject = new GenericsClass<>("Java");
        System.out.println("Generic Class returns " + stringObject.getData());

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



    // In this example, we are demonstrating generic STATIC methods (methods that belong to the class.)
    public static <T> void staticGeneric(T value)
    {
        System.out.println(value);
        // now go to the <main> method and see what it will print out!!
    }


    // In this example, we will use generics with arrays
    public static <E> void printArray(E[] elements)
    {
        for (E element : elements)
        {
            System.out.println(elements);
        }
    }

}
