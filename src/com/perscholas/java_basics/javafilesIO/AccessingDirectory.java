package com.perscholas.java_basics.javafilesIO;
import java.io.File;
import java.util.Arrays;

public class AccessingDirectory {
     public static void main(String[] args) {
         String path = "C:/Users/Downloads/TestingFolder";
         File dir = new File(path);
         System.out.println(dir.isDirectory());
         // prints false...


         File[] FileWithPath =  dir.listFiles(); // Return  contents of the directory in a File-array.
         System.out.println(Arrays.toString(FileWithPath));
         // prints null...
        }
    }
