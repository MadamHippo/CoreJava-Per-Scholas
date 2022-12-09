package com.perscholas.java_basics.inheritance.inheritanceDemo;

public class Hospital {
    // this will be the main() file
    public static void main(String[] args) {

        // create new Object called Dr.Smith that's a new instance of surgeon..
        Surgeon DrSmith = new Surgeon();

        DrSmith.DoctorDetails();
        // prints only "doctor details..."

        DrSmith.SurgeonDetails();
        // prints:
            // Surgeon detail...
            // Cardio
            // Marcus Smith




        // Based on the above example, we can say that Surgeon IS-A Doctor.
        // This means a child class has an IS-A relationship with the parent class.
        // This inheritance is known as the IS-A relationship between the child and parent class.
    }
}
