package com.perscholas.java_basics.exceptions.customExceptions;

public class ProductChecker {
    public void productCheck(double weight) throws CustomExceptionProduct {
        if (weight<100){
            throw new CustomExceptionProduct("Product weight is exceed");
        }
    }
}
