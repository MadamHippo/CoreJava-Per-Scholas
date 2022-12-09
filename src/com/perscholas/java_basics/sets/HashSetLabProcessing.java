package com.perscholas.java_basics.sets;
import java.util.HashSet;


public class HashSetLabProcessing {
    public static void main(String[] args) {

        // ++++++++++++ Union of 2 different sets ++++++++++++++
                HashSet<Integer> evenNumbers = new HashSet<>();
                evenNumbers.add(2);
                evenNumbers.add(4);
                System.out.println("HashSet1: " + evenNumbers);

                HashSet<Integer> numbers = new HashSet<>();
                numbers.add(1);
                numbers.add(3);
                System.out.println("HashSet2: " + numbers);

                // Union of two set
                numbers.addAll(evenNumbers);
                System.out.println("Union is: " + numbers);

                /*
                Output
                HashSet1: [2, 4]
                HashSet2: [1, 3]
                Union is: [1, 2, 3, 4]
                */


        // ++++++++++++ Difference of 2 different sets ++++++++++++++
                HashSet<Integer> primeNumbers = new HashSet<>();
                primeNumbers.add(2);
                primeNumbers.add(3);
                primeNumbers.add(5);
                System.out.println("HashSet1: " + primeNumbers);

                HashSet<Integer> oddNumbers = new HashSet<>();
                oddNumbers.add(1);
                oddNumbers.add(3);
                oddNumbers.add(5);
                System.out.println("HashSet2: " + oddNumbers);

                // Difference between HashSet1 and HashSet2
                primeNumbers.removeAll(oddNumbers);
                System.out.println("Difference: " + primeNumbers);
                // it prints out [2], if you want to print out [1] swap primeNum and oddNum positions

                /*
                Output:
                HashSet1: [2, 3, 5]
                HashSet2: [1, 3, 5]
                Difference: [2]
                 */

        // ++++++++++++ Using For: Each Loop with Set ++++++++++++++
                HashSet<String> hset = new HashSet<String>();

                // Adding elements to the HashSet
                hset.add("Apple");
                hset.add("Mango");
                hset.add("Grapes");
                hset.add("Orange");
                hset.add("Fig");
                //Addition of duplicate elements
                hset.add("Apple");
                hset.add("Mango");
                //Addition of null values
                hset.add(null);
                hset.add(null);

        // Using advanced for loop
                for (String str : hset) {
                    System.out.println(" ---> " + str);


                    /* Output:
                     ---> null
                     ---> Apple
                     ---> Grapes
                     ---> Fig
                     ---> Mango
                     ---> Orange
                    */
                }
    }
}

