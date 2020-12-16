package com.fundamentals.exercises;

import java.util.Scanner;

public class Lesson7Exercises {

    //This method demonstrates the Scanner utility
    public void multiplyTwoNumbers() {
        int num1,num2, num3;
        System.out.println("Enter the first numbers.");
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        System.out.println("Enter the second numbers.");
        num2 = in.nextInt();
        num3 = num1 * num2;
        System.out.println("The product of two entered values = "+num3);
    }// end method multiply two numbers

    public void doubleDataType(){
        long val1 = 25, val2 = 50;
        val1 += val2;
        System.out.println(val1);
        val2 *= val1;
        System.out.println(val2);
        val1 %= val2;
        System.out.println(val1);
        val2 ^= val1;
        System.out.println(val2);
    }//end method example assignment 2

    public void mathProblem() {
        int a = 10, b = 32, c= 12, d = 3, x, y;
        x = a + b * c/d;
        System.out.println(x);
        y = (a + b) * c/d;
        System.out.println(y);
    }

} // end the class
