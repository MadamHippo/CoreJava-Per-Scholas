package com.perscholas.java_basics.classes.Lambda;

import java.util.Scanner;

public class LambdaDemo {

    public static void main(String[] args) {

        int userNum;

        // Create scanner object for keyboard input
        Scanner scan = new Scanner(System.in);

        // Create an object that implements IntCalc
        IntCalculator square = param_x -> param_x * param_x;

        // Get num from user
        System.out.println("Enter an integer number");
        userNum = scan.nextInt();

        // Display the square of num as output
        System.out.println(square.calculate(userNum));



        // another example, if lambda has 2 or multiple parameters...

        IntCalculator2 addParams = (a, b) -> a + b;

        System.out.println("Enter an integer number");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(addParams.add(a, b));

    }
}


/*

Quick list of ALL the things that can go wrong. Debug lambdas.

•	 Attempting to access a private superclass member directly from a subclass. Private
superclass members cannot be directly accessed by a method in a subclass. The subclass must call a public or protected superclass method in order to access the superclass’s private members.
•	 Forgetting to call a superclass constructor explicitly when the superclass does not have
a default constructor or a programmer-defined no-arg constructor. When a superclass
does not have a default constructor or a programmer-defined no-arg constructor, the
subclass’s constructor must explicitly call one of the constructors that the superclass
does have.
•	 Allowing the superclass’s no-arg constructor to be implicitly called when you intend to
call another superclass constructor. If a subclass’s constructor does not explicitly call a
superclass constructor, Java automatically calls the superclass’s no-arg constructor.
•	 Forgetting to precede a call to an overridden superclass method with super. When a
subclass method calls an overridden superclass method, it must precede the method
call with the key word super and a dot (.). Failing to do so results in the subclass’s
version of the method being called.
•	 Forgetting a class member’s access specifier. When you do not give a class member an
access specifier, it is granted package access by default. This means that any method in
the same package may access the member.
•	 Writing a body for an abstract method. An abstract method cannot have a body. It
must be overridden in a subclass.
•	 Forgetting to terminate an abstract method’s header with a semicolon. An abstract
method header does not have a body, and it must be terminated with a semicolon.
•	 Failing to override an abstract method. An abstract method must be overridden in
a subclass.
•	 Overloading an abstract method instead of overriding it. Overloading is not the same
as overriding. When a superclass has an abstract method, the subclass must have a
method with the same signature as the abstract method.
•	 Trying to instantiate an abstract class. You cannot create an instance of an abstract class.
•	 Implementing an interface but forgetting to provide all of the methods specified by the
interface. When a class implements an interface, all of the methods specified by the
interface must be provided in the class.
•	 Writing a method specified by an interface but failing to use the exact signature and
return type. When a class implements an interface, the class must have methods with
the same signature and return type as the methods specified in the interface.
 */