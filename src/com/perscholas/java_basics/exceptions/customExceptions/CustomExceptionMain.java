package com.perscholas.java_basics.exceptions.customExceptions;

public class CustomExceptionMain {
    public static void main(String[] args) {

        // create instance of CustomException2 class...
        ProductChecker object = new ProductChecker();
        try
        {
            object.productCheck(60);
        }
        catch (CustomExceptionProduct error)
        {
            System.out.println("Caught the exception");
            System.out.println(error.getMessage());
        }
    }
}
