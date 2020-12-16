package com.fundamentals.exercises;

public class Lesson6Exercises {

    String myString = "GOD IS GREAT!";

    public String getMyString() {
        return myString;
    }


    // Methods teaks a string and converts it to all lowercase
    public String exercises6Lowercase() {
        return myString.toLowerCase();
    } // end method exampleLowercase

    public void exercises6Char(){
        char c1 = '\u00B6';
        System.out.println(c1);
    }

    // Method shows escape sequences
    public void exercises6Escape() {
        System.out.println(" Jack and Jill\n Went up the hill\n To fetch a pail of water.\n Jack fell down and broke his crown\n And jill came tumbling after.");
    } // end method exampleEscape
} // end class

