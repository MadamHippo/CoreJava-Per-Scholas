package com.perscholas.java_basics.classes.JavaPracticeBookQuestions.Chapter6;

public class PersonalInformation {

    String name;
    String address;
    int age;
    String phoneNumber;


    // constructors
    PersonalInformation(String name, String address, int age, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }


    // getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public  int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    // setters
    public void setName(String newName) {
        this.name = newName;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setPhoneNumber(String newPhoneNum) {
        this.phoneNumber = newPhoneNum;
    }



}
