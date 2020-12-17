package com.fundamentals.exercises;

public class Lesson8Exercises {

    // This method shows and if else statement
    public void exercises8IfElse(int value1, int value2){
        if(value1 == value2){
            System.out.println("The value are equal");
        } else {
            System.out.println("The values are not equal");
        }//end if else
    } // end method basic if else

    // This method shows how a switch characters to string
    public static void exercises8Switch() {
        char gradeChar = 'E';
        switch (gradeChar) {
            case 'E':
                System.out.println("Excellent");
                break;
            case 'V':
                System.out.println("Very Good");
                break;
            case 'G':
                System.out.println("Good");
                break;
            case 'A':
                System.out.println("Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Not a valid grade’");
                break;
        }// end switch
    } // end switch method


    // This method shows how to do a do while loop
    public void exercises8DoWhile(){
        int num = 0; // initialized value
        do{
            if(num % 3 == 0){
                System.out.println(num);
            }
            num++;  // increment
        } while(num <= 30); // expression
    } // end do while loop
} // end class
