package com.perscholas.java_basics.arraylists;
import java.util.ArrayList;

public class showData {
    public static void main(String[] args) {
        // instantiation to class AddDataToArrayList
        ArrayListBooksData b = new ArrayListBooksData();
        ArrayList<ArrayListBooks> mybooklist = b.bookdetails();
        for(ArrayListBooks showValue: mybooklist)
        {
            // ---- invoking getter method for getting Data---------
            System.out.println(showValue.getNumber() + " " + showValue.getName() +" "+ showValue.getCategory() +" "+ showValue.getAuthor());
        }
    }
}