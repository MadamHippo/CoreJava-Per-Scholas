package com.perscholas.java_basics.variables;

public class LoopPracticeAssignment {
        public static void main(String[] args) {

            // JD Module 303.1 - Practice Assignment - Core Java - Variables


            // step #1
            int a = 4;
            int b = 5;

            int sum;

            sum = a + b;

            System.out.println(sum);

            // step #2

            double c = 1.25;
            double d = 2.75;

            double sum2;

            sum2 = c + d;

            System.out.println(sum2);

            // step #3
            // the sum must be a double or the int will be lossy

            int e = 3;
            double f = 3.1;

            double sum3;

            sum3 = e + f;

            System.out.println(sum3);

            // step #4
            // You need to change from int to double after changing the larger number to a decimal.
            int g = 10;
            double h = 100.50;

            double division_total;

            division_total = h / g;

            System.out.println(division_total);


            // step #5
            double i = 10.5;
            double j = 5.25;

            double division_total2 = i / j;
            System.out.println(division_total2);
            // sout = system out shortcut

            // casting result to integer...
            int division_total_int;
            division_total_int = (int)division_total2;
            System.out.println(division_total_int);
            // the newly casted double (2.0) is now just int 2.


            // step #6

            int x = 5;
            int y = 6;

            double q = y/x;
            System.out.println(q);
            // prints 1

            // casting y to double...
            // loss of precision compliant unless I changed int q to double q and recast y.
            q = (double)y/x;
            System.out.println("step 6: " + q);

            // step #7
            // named constants in a calculation
            int shirt = 8;
            int shirt_sold = 3;

            int total_shirt = shirt - shirt_sold;
            System.out.println(total_shirt);

            // step #8
            // My own cafe...

            double coffee = 2.5;
            double egg_sandwich = 3.5;
            int green_tea = 1;

            double subtotal;
            double totalSale;

            // complete an “order” for 3 items of the first product
            double order1 = coffee*3;
            System.out.println(order1);

            // 4 items of the second product
            double order2 = egg_sandwich*4;
            System.out.println(order2);

            // 2 items of the third product
            int order3 = green_tea*2;
            System.out.println(order3);

            // subtotal
            subtotal = order1 + order2 + order2;
            System.out.println(subtotal);
            // prints out $35.5

            // salesTax and totalSale amount
            double salesTax = 0.10;
            totalSale = subtotal + (subtotal*salesTax);
            System.out.println(totalSale);
            // totalSale is subTotal + salesTax = $39.05


            /*
            The big key is just to remember that a variable doesn’t have any magic knowledge of what it is,
            it is actually just a reference to an address in memory. Mostly that doesn’t make a big difference,
            but there are time, like checking equality that it can be important.
             */

            int object1 = 11;
            int object2 = object1;

            System.out.println(object1);
            // both print out 11
            System.out.println(object2);
            // both print out 11

            object1+=5;
            System.out.println(object1);
            // prints out 16 now
            System.out.println(object2);
            // old memory points to 11 still...





        }
}
