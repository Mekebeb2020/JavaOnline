package com.fundamentals.lessons;

import java.util.Scanner;
/*
* the content of this class goes overLesson 7 contents
* */

public class Lesson7 {

    int value1 = 23, value2 = 45;

    // this method does basic math
    public void basicMath() {
        System.out.println(value1 + value2);
        System.out.println(value2 - value1);
        System.out.println(value1 * value2);
        System.out.println(value1 /value2);
    } // end method basic math
    // This method calculate modulus
    public void exampleModulus() {
        int total = value1 % value2;
        System.out.println(total);
    }//end method example modulus

    //This method demonstrates the Scanner utility
    public void addTwoNumbers() {
        int x,y,z;
        System.out.println("Enter two numbers so calculate their sum.");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x +y;
        System.out.println("The sum of entered values = "+z);
    }// end method add two numbers

   // This method covers assignment operator for basic math
    public void exampleAssignment1(){
        value1 += value2;
        System.out.println(value1);
        value2 -= value1;
        System.out.println(value2);
        value1 *= value2;
        System.out.println(value1);
        value2 /= value1;
        System.out.println(value2);
        value2 %= value1;
        System.out.println(value1);
    }// end method example assignment 1
    public void exampleAssignment2(){
        int beta = 10, charlie = 5;
        beta <<= charlie;
        System.out.println(beta);
        charlie >>= beta;
        System.out.println(charlie);
        beta &= charlie;
        System.out.println(beta);
        charlie ^= beta;
        System.out.println(charlie);
    }//end method example assignment 2

    // This method covers the increment operator
    public void exampleIncrement(){
     int home = 10, car, bike;
     car = home++;
     System.out.println(car);
     bike = ++home;
     System.out.println(bike);
    }//end method example increment

    // This method covers the Decrement operator
    public void exampleDecrement() {
        int bottle = 4, mug, pitcher;
        mug = bottle--;
        System.out.println(mug);
        pitcher = --bottle;
        System.out.println(pitcher);
    }// end method example decrement
}//end class
