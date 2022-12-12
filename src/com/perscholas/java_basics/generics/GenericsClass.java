package com.perscholas.java_basics.generics;

// In this example, we will use generics with Class type

public class GenericsClass<T> {
    // class variable of T type
    private T data;

    // constructor
    public GenericsClass(T data)
    {
        this.data = data;
    }
    // method that return T type variable
    public T getData()
    {
        return this.data;
    }

    /*Here, T used inside the angle bracket <> indicates the type parameter.
    The getData() method returns exactly the type being held.
     */


}
