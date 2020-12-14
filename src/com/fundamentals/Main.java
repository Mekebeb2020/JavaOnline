package com.fundamentals;

import com.fundamentals.lessons.Lesson5;
import com.fundamentals.lessons.Lesson6;

/*
* This Main class is the entry point to the application
* */
public class Main {

    public static void main(String[] args) {
    // This prints Hello Java
        // System.out.println("Hello Java");

        //House myHouse = new House();
        //Lesson5Examples();
        lesson6Examples();
    } // end main method


    public static void lesson6Examples() {
        Lesson6 myLesson6 = new Lesson6();
        myLesson6.exampleCharAt();
        myLesson6.exampleEquals("Happy");
        String myStr1 = myLesson6.exampleLowercase();
        System.out.println(myStr1);
        System.out.println(myLesson6.exampleUpperCase());
        myLesson6.exampleLength();
        myLesson6.exampleBuilder("pizza",3);
        myLesson6.exampleChar();
        myLesson6.exampleEscape();
    } // end method lesson6Examples


    //  public static void main(String[] args) {
	// write your code here
        //System.out.println("Hello Java");

        //House myHouse = new House();


} // end class
