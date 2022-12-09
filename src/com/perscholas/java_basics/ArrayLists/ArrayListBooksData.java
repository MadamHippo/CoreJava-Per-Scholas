package com.perscholas.java_basics.ArrayLists;
import java.util.ArrayList;


public class ArrayListBooksData {

    public  ArrayList<ArrayListBooks> bookdetails() {
        //User-defined class objects in Java ArrayList

        ArrayList<ArrayListBooks> list = new ArrayList<ArrayListBooks>();
        // Passing data using Constructors
        ArrayListBooks b1 = new  ArrayListBooks(1, "Death note", "John", "cartoon");
        ArrayListBooks b2 = new ArrayListBooks(2, "Stranger Things", "brothers", "suspense");
        ArrayListBooks b3 = new ArrayListBooks(3, "Spider man", "Alex", "Kids");
        ArrayListBooks b4 = new ArrayListBooks(4, "GentleMen", "Max", "Action");
        // Passing data using setter
        ArrayListBooks b5 = new ArrayListBooks();
        b5.setNumber(5);
        b5.setName("Java FullStack");
        b5.setAuthor("Flex");
        b5.setCategory("Programming");
        // Adding Books objects to Arraylist
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        return list;
    }
}
