package com.perscholas.java_basics.Generics;

// A class can have more than one type parameter. In this case, the type parameters are separated by a comma.

public class multipleGenericsPractice <DataType1, DataType2> {


    public static void main(String[] args){
        // initialize generic class
        // with String and Integer data

        multipleGenericsPractice<String, Integer> object = new multipleGenericsPractice<>("Per Scholas", 11025);

        System.out.println(object.getValue1());
        System.out.println(object.getValue2());


        // initialize generic class
        // with String and String data
        multipleGenericsPractice<String, String> object2 = new multipleGenericsPractice<>("Per Scholas", "Non profit");
        System.out.println(object2.getValue1());
        System.out.println(object2.getValue2());

    }



    // Class variable
    DataType1 value1;
    DataType2 value2;

    // Constructor
    public multipleGenericsPractice(DataType1 valueOne, DataType2 valueTwo){
        this.value1 = valueOne;
        this.value2 = valueTwo;
    }

    public DataType1 getValue1(){
        return value1;
    }

    public void setValue1(DataType1 value1){
        this.value1 = value1;
    }
    public DataType2 getValue2(){
        return value2;
    }
    public void setValue2(DataType2 value2){
        this.value2 = value2;
    }
}
