package com.fundamentals.exercises;


public class Lesson9Exercises {
    public void  iceCreamFlavors() {
        String[][] stringArray = new String[1][5];
        stringArray[0][0] = "Chocolate";
        stringArray[0][1] = "Vanilla";
        stringArray[0][2] = "Strawberry";
        stringArray[0][3] = "Butter pecan caramel";
        stringArray[0][4] = "Green tea";
        for (int i = 0; i < stringArray.length; i++) {
            for (int k = 0; k < stringArray[i].length; k++) {
                System.out.println(stringArray[i][k]);
            }// end inner for loop
        } // end outer for loop
    } // end Ice Cream Flavor

    // This method show a Chiefs football scores from the 2019 regular season array 2D
    public void chiefsArray(){
        int[][] myArray = {{38,17},{17,7},{17,27},{27,20},{26,40},
                {10,28},{26,40},{10,28},{33,28},{30,34},{13,19},{24,31},
                {6,30},{24,31},{6,30},{24,31},{26,23},{35,32},{17,24},{40,9},
                {16,23},{23,3},{3,26},{31,21},{51,31},{35,24},{31,20}};
        for(int i = 0; i<myArray.length;i++){
            for(int m = 0; m < myArray[i].length; m++){
                System.out.println(myArray[i][m]);
            } // end inner for loop
        } // end outer for loop
    } // end method Chiefs two dimensional array
} // end class