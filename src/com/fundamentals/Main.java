package com.fundamentals;

import com.fundamentals.exercises.Lesson6Exercises;
import com.fundamentals.exercises.Lesson7Exercises;

import com.fundamentals.lessons.Lesson7;
import com.fundamentals.lessons.Lesson8;

/*
* This Main class is the entry point to the application
* */
public class Main {

    public static void main(String[] args) {
    // This prints Hello Java
        // System.out.println("Hello Java");
        //House myHouse = new House();
        //lesson7Examples();
       // Lesson7Exercises();
        lesson8Example();
    } // end main method

    public static void lesson8Example(){
        Lesson8 myLesson8 = new Lesson8();
        myLesson8.basicIfExample(5,5);
        myLesson8.basicIfElseExample(12,17);
        myLesson8.basicIfElseChainExample(42);
        myLesson8.basicIfAndOrExample(108);
        myLesson8.basicSwitchExample(2);
        myLesson8.basicWhileExample();
        myLesson8.basicDoWhileExample();
        myLesson8.basicForLoopExample();
        myLesson8.basicBranchExample();

    }

    public static void Lesson7Exercises () {
        Lesson7Exercises myLesson7Exercises = new Lesson7Exercises();
        myLesson7Exercises.multiplyTwoNumbers();
        myLesson7Exercises.doubleDataType();
        myLesson7Exercises.mathProblem();

    }

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
