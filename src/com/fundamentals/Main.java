package com.fundamentals;

import com.fundamentals.exercises.Lesson6Exercises;
import com.fundamentals.lessons.Lesson5;
import com.fundamentals.lessons.Lesson6;
import com.fundamentals.lessons.Lesson7;

/*
* This Main class is the entry point to the application
* */
public class Main {

    public static void main(String[] args) {
    // This prints Hello Java
        // System.out.println("Hello Java");
        //House myHouse = new House();
        //Lesson5Examples();
        //lesson6Examples();
        //Lesson6Exercises();
        lesson7Examples();
    } // end main method
    public static void lesson7Examples (){
        Lesson7 myLesson7 = new Lesson7();
        myLesson7.basicMath();
        myLesson7.exampleModulus();
       // myLesson7.addTwoNumbers();
        myLesson7.exampleAssignment1();
        myLesson7.exampleAssignment2();
        myLesson7.exampleIncrement();
        myLesson7.exampleDecrement();
    }


    public static void Lesson6Exercises() {
        Lesson6Exercises myLesson6Exercises = new Lesson6Exercises();
        myLesson6Exercises.exercises6Char();
        String myStr3 = myLesson6Exercises.exercises6Lowercase();
        System.out.println(myStr3);
        myLesson6Exercises.exercises6Escape();

    } // end method lesson6Examples


    //  public static void main(String[] args) {
	// write your code here
        //System.out.println("Hello Java");

        //House myHouse = new House();


} // end class
