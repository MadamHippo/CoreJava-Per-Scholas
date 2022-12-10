package com.perscholas.java_basics.sets;

import java.util.Comparator;

public class TreeSet_Comparator implements Comparator<String>{

    // override compare method to compare two elements of the TreeSet

    /*
    We can also sort TreeSet in a customized order by defining a new comparator class. In this comparator class,
    we need to override the ‘compare’ method to sort the elements of the TreeSet. This comparator object is then
    passed to the TreeSet constructor.
     */
    @Override
    public int compare(String o1, String o2) {
        int city = o1.compareTo(o2);

        // sort elements in reverse order
        if (city > 0)
        {
            return -1;
        }
        else if (city < 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }

    }
}
