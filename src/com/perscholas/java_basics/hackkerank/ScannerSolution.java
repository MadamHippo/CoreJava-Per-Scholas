package com.perscholas.java_basics.hackkerank;


import java.util.Scanner;

public class ScannerSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // assign variable to scanner
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double d = scan.nextDouble();

        // clear the buffer...
        scan.nextLine();
        String e = scan.nextLine();

        //print integers
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        // to prevent memory leak its better to close it
        scan.close();
    }
}
