package com.perscholas.java_basics.sets;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetLab {
    /*
    To access the individual elements of TreeSet, we need to iterate through the TreeSet. In other words, traverse through the TreeSet.
We do this by declaring an Iterator for the TreeSet, and then use this Iterator to access each element. For this, we use the next () method of an iterator that returns the next element in the TreeSet.
     */

    ////////////////////////////// Iterating and Accessing Tree Set Problem ///////////////////////////////

    public static void main(String[] args) {
        TreeSet<Integer> num_Treeset = new TreeSet<>();
        num_Treeset.add(20);
        num_Treeset.add(5);
        num_Treeset.add(15);
        num_Treeset.add(25);
        num_Treeset.add(10);

        // Call iterator() method to define Iterator for TreeSet
        Iterator<Integer> iter_set = num_Treeset.iterator();
        System.out.print("TreeSet using Iterator: ");
        // Access TreeSet elements using Iterator
        while(iter_set.hasNext()) {
            System.out.print(iter_set.next());
            System.out.print(", ");
        }

        // Output;
        //TreeSet using Iterator: 5, 10, 15, 20, 25,




        ////////////////////////////// Iterating and Removing Tree Set Problem ///////////////////////////////

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using the remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);

        // Using the removeAll() method
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);

        /*
        Output:
        TreeSet: [2, 5, 6]
        Is 5 removed? true
        Are all elements removed? true
         */



        ////////////////////////////// Tree Set Method for Navigation ///////////////////////////////

        TreeSet<Integer> nav_numbers = new TreeSet<>();
        nav_numbers.add(2);
        nav_numbers.add(20);
        nav_numbers.add(60);
        System.out.println("TreeSe format: " + nav_numbers);

        // using first() method
        int first_num = nav_numbers.first();
        System.out.println("First Number: " + first_num);

        // using last() method
        int last_num = nav_numbers.last();
        System.out.println("Last Number: " + last_num);

        /*
        TreeSe format: [2, 20, 60]
        First Number: 2
        Last Number: 60
         */



    }

}
