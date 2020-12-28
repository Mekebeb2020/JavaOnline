package com.fundamentals.exercises;

import java.util.Scanner;

public class Lesson18Exercises {

    public void exercises18Exception() {
        int value = Integer.parseInt("10");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year.");
        value = in.nextInt();
        boolean isLeap = false;
        if(value % 4 == 0) {
            if (value % 100 == 0) {
                if (value % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            } else
                isLeap = true;
        }
        else {
            isLeap = false;
        }
        if(isLeap==true)
            System.out.println(value +" is a leap year");
        else
            System.out.println(value +" is not a leap year");


        try {
            System.out.println("you did not provide a valid year");
        } catch (NullPointerException e) {
            System.out.println("Null Exception thrown" + e.getMessage());
        } finally {
            System.out.println("Finally block called");
        } // End try/catch/finally

    }
}

