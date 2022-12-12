package com.perscholas.java_basics.exceptions.customExceptions;

public class CustomExceptionProduct extends Exception {
    public CustomExceptionProduct(String input_string){
        //call constructor of parent Exception...
        super(input_string);
    }
}
