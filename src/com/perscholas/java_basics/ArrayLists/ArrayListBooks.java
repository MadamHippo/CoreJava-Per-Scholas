package com.perscholas.java_basics.ArrayLists;

// https://docs.google.com/document/d/1MOLQ4cKx6LkqPIVSXW2a4hUMgpQVQEPH1wMaoJ29fU0/edit
// LAB - 303.7.3  - ArrayList of User-Defined Objects

import java.util.ArrayList;

// plain old java

public class ArrayListBooks {
    private  int number;
    private  String name;
    private String author;
    private  String category;


    // Constructor with arguments
    public ArrayListBooks(int number, String name, String author, String category)
    {
        this.name = name;
        this.category = category;
        this.author = author;
        this.number = number;
    }
    // Constructor without arguments
    public ArrayListBooks()
    {

    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name1) {
        this.name = name1;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
