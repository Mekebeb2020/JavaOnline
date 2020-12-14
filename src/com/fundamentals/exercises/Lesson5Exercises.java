package com.fundamentals.exercises;

public class Lesson5Exercises {

    // This primitive type has a value range of -128 to -127
    byte myByte = 9;

    // This primitive type has a value range of -32768 to 32767
    short myShort = 235;

    /* This primitive type has a value range of
    -2,147,483,648 to 2,147,483,647*/
    int myInt = 2354;

    /* this primitive type has a value range of
     * -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 */
    long myLong = 56864L;

    // This primitive type has a value range of 3.4E-038 to 3.4+038
    float myFloat = 3.453F;

    // This primitive type  has a value range of 1.7E-308 to 1.7E+308
    double myDouble = 36.43D;
    // Decimal value of 26
    int value = 29;

    // Hexadecimal value of 26
    int value2 = 0x1D;

    // Binary value of 26
    int value3 = 0b11101;

    // Method show implicit conversions
    public void wideningConversions() {
        double example1 = myLong; // implicit or widening conversion
        int example2 =  myByte; // implicit or widening conversion
        float example3 = myInt; // implicit or widening conversion
        System.out.println(example1);
        System.out.println(example2);
        System.out.println(example3);
    }
    // Method show explicit conversions
    public void narrowingConversions() {
        long example4 = (int) myDouble; // explicit or narrowing conversion
        int example5 = (int) myFloat; // explicit or narrowing conversion
        long example6 = myLong; // explicit or narrowing conversion
        System.out.println(example4);
        System.out.println(example5);
        System.out.println(example6);

    }

}
