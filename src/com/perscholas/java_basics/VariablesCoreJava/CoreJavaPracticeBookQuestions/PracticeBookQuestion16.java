package com.perscholas.java_basics.VariablesCoreJava.CoreJavaPracticeBookQuestions;

public class PracticeBookQuestion16 {
    public static void main(String[] args) {
        // energy drink consumption...
        int customerSurveyed = 12467;
        double hardcoreCustomers = 0.14;
                // 1745.38;
        double hardcoreCustomersCitrus = 0.64;
                // 1117.0432;

        double hardcoreCustomersCount = customerSurveyed * hardcoreCustomers;
        double hardcoreCustomersCitrusCount = hardcoreCustomersCount * hardcoreCustomersCitrus;
        System.out.println(hardcoreCustomersCount);
        System.out.println(hardcoreCustomersCitrusCount);
    }
}
