package com.perscholas.java_basics.exceptions;

public class UserExceptions extends Exception {

    private String string1;


    /* Constructor of custom exception class here I am copying the message that we are passing while throwing
    the exception to a string and then displaying that string along with the message. */

    UserExceptions(String string2){
        this.string1=string2;
    }
    public String toString(){
        return ("--->> UserException Occurred :"+string1);
    }
}
