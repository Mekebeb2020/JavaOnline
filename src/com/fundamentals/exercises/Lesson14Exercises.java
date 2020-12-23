package com.fundamentals.exercises;



public class Lesson14Exercises {


    public static void myVoltageMethod(int current, int resistance){
        int voltage = current * resistance;
        System.out.println(voltage);

    }

    public static void myCurrentMethod(int voltage, int resistance){
        int current = voltage / resistance;
        System.out.println(current);

    }

    public static void myResistanceMethod(int current, int voltage){
        int resistance = voltage / current;
        System.out.println(resistance);

    }



}


