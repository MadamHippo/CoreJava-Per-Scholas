package com.perscholas.java_basics.variables.CoreJavaPracticeBookQuestions;

public class StringFormatNames {
    // Practice problem #2!! Names and initials
    static String firstName= "Xiao Xiao";
    static String middleName = "Lily";
    static String lastName = "He";

    public static void main(String[] args) {


        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);

        //String answer = firstName + middleName + lastName + firstInitial + middleInitial + lastInitial;

        System.out.println(firstInitial + "" + middleInitial + "" + lastInitial);
        // now it prints XLH
        // adding "" converts them to a string instead of char....
        // without "", it prints 236...because that's how chars print..index...print the numerical value but if you join it with a string, it prints the character itself.


    }
}
