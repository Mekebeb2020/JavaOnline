package com.fundamentals.lessons;

/*
* The contents of this class is to go overLesson 8 contents
* Control Flow Statement
* */
public class Lesson8 {

    // This method shows if statement
    public void basicIfExample(int num1, int num2){
        System.out.println("Before if Statement");
        if(num1 == num2){
           System.out.println("Values are equal");
        }// end iff
        System.out.println("After if statement");
    }// end method basic if example

    // This method shows and if else statement
    public void basicIfElseExample(int alpha, int beta){
        System.out.println("Before is Statement");
        if(alpha != beta){
            System.out.println("The value are not equal");
        } else {
            System.out.println("The values are equal");
        }//end if else
        System.out.println("End of if else statement");
    } // end method basic if else

    //this method shows an if else chain statements
    public void basicIfElseChainExample(int value) {
      if(value < 30){
          System.out.println("the value is less than 30");
      } else if(value <= 40 ){
          System.out.println("The value is greater than 30 but less than or equal to 40");
      } else {
          System.out.println("The value is greater than 40");
      } // end if
    } // end method if else chain

    // This method shows how to use the And/Or statement with if
    public void basicIfAndOrExample(int num){
        if(num > 100 || num < 50){
            System.out.println("The value is less than 50 or greater than 100");
        } // end iff
        if(num % 2 == 0 && num > 30){
            System.out.println("The value is greater than 30 and an even number");
        } // end if
    } // end method basic if and or example

    // This method shows how a switch statement is used
    public void basicSwitchExample(int day) {
        switch (day) {
            case 1:
                System.out.println("day = 1");
                break;
            case 2:
            case 3:
                System.out.println("day is either 2 or 3");
                break;
            default:
                System.out.println("day is greater than 3");
                break;
        }// end switch
    } // end method basic switch example

    // This method shows how to do the wile loop
    public void basicWhileExample(){
      int val = 0; // initialized value
      while (val < 10){ // expression
          System.out.println(val);
          val++; // increment
      }
    }// end while basic examples

    // This method shows how to do a do while loop
    public void basicDoWhileExample(){
        int num = 0; // initialized value
        do{
            if(num % 2 == 0){
                System.out.println(num);
            }
            num++;  // increment
        } while(num < 24); // expression
    } // end do while loop

    // this method show how to use for loop
    public void basicForLoopExample(){
        for(int i = 0; i<10; i++) {
            System.out.println(i);
        } // end for loop
    } // end basic for loop method

    // This method shows the branching statement of continue and break
    public void basicBranchExample(){
        for(int i = 0; i < 10; i++){
            if(i == 2) {
                continue;
            }
            if(i == 4) {
                System.out.println("Loop breaks");
                break;
            }
            System.out.println(i);
        }// end for loop
        System.out.println("End of loop");
    }// end method basic branch examples
}// end class
