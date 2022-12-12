package com.perscholas.java_basics.exceptions;

public class MyRunnerException {

    public static void main(String[] args) {
        try{
            System.out.println("Starting of the try block");
            // throwing custom exception using 'throw'
            throw new UserExceptions("My error Message!!!");
        }
        catch (UserExceptions exp){
            System.out.println("---> Catch Block");
            System.out.println(exp);
            // exp prints "--->> UserException Occurred:"
        }
    }
}
