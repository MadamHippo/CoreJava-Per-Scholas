package com.perscholas.java_basics.Polymorphism;


// Interface = english definition is "a point where two systems, subjects, organizations, etc. meet and interact"
// defining a list of methods that defines how it can be interacted with but it doesn't implement anything.
// like a design plan.

public class PolymorphismAndInterface {
    public static void main(String[] args) {

        KidUsers billy = new KidUsers();

        billy.age = 10;
        billy.registerAccount();
        billy.age = 18;
        billy.registerAccount();

        billy.bookType = "Kids";
        billy.requestBook();
        billy.bookType = "Fiction";
        billy.requestBook();


        AdultUser mom = new AdultUser();

        mom.age = 40;
        mom.registerAccount();
        mom.age = 5;
        mom.registerAccount();

        mom.bookType = "Kids";
        mom.requestBook();
        mom.bookType = "Fiction";
        mom.requestBook();
    }




    // anything that implements the library user interface, must support these 2 methods.
    public interface LibraryUser{
        void registerAccount();
        void requestBook();
    }

    public static class KidUsers implements LibraryUser {

        int age;
        String bookType;

        @Override
        public void registerAccount() {
            if (age<=11){
                System.out.println("You have successfully registered under a Kids Account");
            } else {
                System.out.println("Sorry, Age must be less than 12 to register as a kid");
            }
        }

        @Override
        public void requestBook() {
            if (bookType.equals("Kids")){
                System.out.println("Book Issued successfully, please return the book within 10 days");
            } else {
                System.out.println("Oops, you are allowed to take only kids books");
            }
        }



    }

    public static class AdultUser implements LibraryUser{

        int age;
        String bookType;

        @Override
        public void registerAccount() {
            if (age>=12){
                System.out.println("You have successfully registered under an Adult Account");
            } else {
                System.out.println("Sorry, Age must be greater than 12 to register as an adult");
            }
        }

        @Override
        public void requestBook() {
            if (bookType.equals("Fiction")){
                System.out.println("Book Issued successfully, please return the book within 7 days");
            } else {
                System.out.println("Oops, you are allowed to take only adult Fiction books");
            }
        }
    }

}
