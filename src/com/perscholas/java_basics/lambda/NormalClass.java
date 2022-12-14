package com.perscholas.java_basics.lambda;

public class NormalClass {
    /* Define an anonymous inner class implementing the interface.*/
    /*Construct an instance and invoke the method. */
    /* anonymous constructor one */
    AnonymousInterfaceHuman anonymousInterfaceHumanObject1 = new AnonymousInterfaceHuman() {
        @Override
        public void say() {
            System.out.println("I am Ironman");
        }
    };
    /* anonymous constructor two */
    AnonymousInterfaceHuman anonymousInterfaceHumanObject2 = new AnonymousInterfaceHuman() {
        @Override
        public void say() {
            System.out.println("I am Tony");
        }
        // In the above code, we defined two instances of an anonymous inner
        // class implementing a Functional Interface.
    };
}
