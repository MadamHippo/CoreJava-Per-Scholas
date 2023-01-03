package com.perscholas.java_basics.hackkerank;
import java.util.regex.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.*;

public class RegexTwosPower {
    final static Scanner scan = new Scanner(System.in);
    final static String fileName = System.getenv("OUTPUT_PATH");


    /*
     * Write the regular expression in the blank space below
     */

    final static String regularExpression = "^0*10*$";
    // ^ is beginning of string
    // $ is end of string
    // * means it could be any number of 0
    // 1 means I have a 1...a singular 1
    // 0* means I have optionally 0 or as many as any number of 0


    public static void main(String[] args) throws IOException {
        int query = Integer.parseInt(scan.nextLine());
        String[] result = new String[query];
        Arrays.fill(result, "False");

        for (int i = 0; i < query; i++) {
            String someString = scan.nextLine();

            if (someString.matches(regularExpression)) {
                result[i] = "True";
            }
        }

        BufferedWriter fileOut = new BufferedWriter(new FileWriter(fileName));
        for (String res: result) {
            fileOut.write(res + "\n");
        }

        fileOut.close();
    }
}
