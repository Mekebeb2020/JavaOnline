package com.fundamentals.lessons;

/*
* The contents of this class is for the Lesson 6 slide Deck
* Strings & More
* */
public class Lesson6 {

    String myString = "Hello";
    char myChar = myString.charAt(2);

    // Method shows String methods for charAt
    public void exampleCharAt() {
        char myChar = myString.charAt(2);
        System.out.println(myChar);
    } // end method exampleCharAt

    //Methods compares two strings to see if they are equal
    public void exampleEquals(String value) {
        boolean myBoolean = myString.equals(value);
        System.out.println(myBoolean);
    } // end methods exampleEquals

    // Methods teaks a string and converts it to all lowercase
    public String exampleLowercase() {
        return myString.toLowerCase();
    } // end method exampleLowercase

    // Method takes a string and converts it to all uppercase
    public String exampleUpperCase() {
        return myString.toUpperCase();
    } // end method exampleUpperCase

    // Method determines the length of string
    public void exampleLength(){
        int length = myString.length();
        System.out.println(length);
    } // end method exampleLength

    // Example of how to use the StringBuilder class
    public void exampleBuilder(String food,int value) {
        StringBuilder builder = new StringBuilder();
        builder.append("My favorite food is ");
        builder.append(food).append(" and I ate ");
        builder.append(value).append(" plates of it.");
        String fav = builder.toString();
        System.out.println(fav);
    } // end method exampleBuilder

    // Method for showing the char data type
    public void exampleChar() {
        char c1 = 'p'; //\u0074
        char c2 = '\u00A7';
        System.out.println(c2);
    } // end method exampleChar

    // Method shows escape sequences
    public void exampleEscape() {
        System.out.println("that\'s a cool toy. \tCan \n play with it.");
    } // end method exampleEscape
} // end class
