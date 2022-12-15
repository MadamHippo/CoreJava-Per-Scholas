package com.perscholas.java_basics.hackkerank;

public class LastAndSecondLast {


    public static void main(String[] args) {
        System.out.println(LastAndSecondLast.lastLetters("candy"));
    }

    /*
     * Complete the 'lastLetters' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING word as parameter.
     */

    public static String lastLetters(String word) {
        // Write your code here


        char last = word.charAt(word.length()-1);
        char secondLast = word.charAt(word.length()-2);

        // "" forces to switch to string; implicit casting.
        String newString = last + " " + secondLast;

        return newString;


        // note: the total length of string is less than 2 then write for edge case...
    }
}
