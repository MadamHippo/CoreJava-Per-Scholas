package com.perscholas.java_basics.exceptions;

import java.io.IOException;

/*
You can use the throw statement to throw an exception manually. The general format of the
throw statement is as follows:

throw new ExceptionType(MessageString);

The throw statement causes an exception object to be created and thrown. In this general
format, ExceptionType is an exception class name and MessageString is an optional String
argument passed to the exception object’s constructor. The MessageString argument contains a custom error message that can be retrieved from the exception object’s getMessage
method. If you do not pass a message to the constructor, the exception will have a null
message. Here is an example of a throw statement:
throw new Exception("Out of fuel");
 */
public class ThrowingExceptions {

    // declare exception using throws in the method signature and the method will be used in the code below with the
    // main that will run the condition.
    // you throw an exception and then use the Try/Catch block to prep for it.
    public void testMethod(int num) throws IOException, ArithmeticException{
        if(num==1)
            throw new IOException("IOException Occurred");
        else
            throw new ArithmeticException("ArithmeticException");
    }
}

/*
Syntax: throw new exception_class("error message");
For example:

throw new ArithmeticException("dividing a number by 5 is not allowed in this program");

*/


/* create another file to run and throw that exception:
public class myRunner {
   public static void main(String args[]){
       try{
           //this try block calls the above method so handle the exception
           Example_Throw obj=new Example_Throw();
           obj.testMethod(1);
       }catch(Exception ex){
           System.out.println(ex);
       }
   }
}
*/