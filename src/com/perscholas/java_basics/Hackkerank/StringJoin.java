package com.perscholas.java_basics.Hackkerank;
import java.util.StringJoiner;


public class StringJoin {

    public static void main(String[] args) {
        StringJoiner mJ1 = new StringJoiner(":", "{","}");
        StringJoiner mJ2 = new StringJoiner(",", "[","]");
        mJ1.add("Name").add("Mike");
        mJ2.add("Lname").add("Jake");
        System.out.println(mJ1.toString());
        System.out.println(mJ2.toString());
        System.out.println(mJ1.merge(mJ2).toString());
        System.out.println(mJ2.merge(mJ1).toString());
    }

}
