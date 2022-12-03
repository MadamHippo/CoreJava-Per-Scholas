package com.perscholas.java_basics.VariablesCoreJava.CoreJavaPracticeBookQuestions;

// learning format strings. Trick is lay out the entire string and plug in values later!!!

public class FormatStringBasics {
    public static void main(String[] args) {
        // Name, age, annual income...
        String name = "Lily";
        int age = 31;
        double annualPay = 1000000;

        //String answer = String.format("My name is %s,", name + "my age is %d", age + " and I hope to earn $ ", annualPay + " per year.");
        //System.out.println(answer);

        String answer2 = String.format("My name is %s, my age is %d, and I hope to earn $ %.2f per year.", name, age, annualPay);
        System.out.println(answer2);
    }
}
