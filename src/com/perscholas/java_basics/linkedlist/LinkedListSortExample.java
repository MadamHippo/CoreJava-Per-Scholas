package com.perscholas.java_basics.linkedlist;
import java.util.*;


public class LinkedListSortExample {
    public static void main(String[] args)
    {
        //Create linked list

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("D");

        //Unsorted
        System.out.println("plain: " + linkedList);

        //1. Sort the list
        Collections.sort(linkedList);

        //Sorted
        System.out.println("sorted: " + linkedList);

        //2. Custom sorting
        Collections.sort(linkedList, Collections.reverseOrder());

        //Custom sorted
        System.out.println("custom sort, reverse order: " + linkedList);

    }
}
