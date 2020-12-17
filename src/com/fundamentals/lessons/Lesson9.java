package com.fundamentals.lessons;

/* The contents of this class is for Lesson 9
* Array
**/
public class Lesson9 {

    // This method shows a basic single dimension array
    public void basicIntArray(){
        int[] intArray = {23,45,12,8,95,103,37};
        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        } // end for loop
    } // end method basic int array

    // This method show a multi-dimensional array 2D
    public void basicTwoDimensionalArray(){
        int[][] myArray = {{23,45},{35,46}};
        for(int i = 0; i<myArray.length;i++){
            for(int m = 0; m < myArray[i].length; m++){
                System.out.println(myArray[i][m]);
            } // end inner for loop
        } // end outer for loop
    } // end method basic two dimensional array

    // This method shows a 3D array
    public void basicThreeDimensionalArray(){
        int [][][] arr = new int[2][2][2];
        arr[0][0][0] = 10;
        arr[0][0][1] = 12;
        arr[0][1][0] = 13;
        arr[0][1][1] = 14;

        arr[1][0][0]= 15;
        arr[1][0][1]= 16;
        arr[1][1][0]= 17;
        arr[1][1][1]= 18;

        for(int i = 0; i < arr.length; i++){
            for(int k = 0; k < arr[i].length; k++){
                for(int m = 0; m < arr[k].length; m++){
                    System.out.println(arr[i][k][m]);
                }// end inner inner for loop
            } //end inner for loop
        }// end outer for loop
    } // end method basic three dimensional array

    // this method demonstrate a jagged array
    public void basicJaggedArray(){
    String [][] stringArray = new String[1][3];
    stringArray[0][0] = "June";
    stringArray[0][1] = "July";
    stringArray[0][2] = "August";
    for(int i = 0; i < stringArray.length; i++){
        for(int k = 0; k < stringArray[i].length; k++){
            System.out.println(stringArray[i][k]);
            }// end inner for loop
        }// end outer for loop
    }// end method basic jagged array
} // end class
