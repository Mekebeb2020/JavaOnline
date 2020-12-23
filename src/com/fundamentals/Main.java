package com.fundamentals;

import com.fundamentals.exercises.*;

import com.fundamentals.lessons.*;

import java.security.PublicKey;

/*
* This Main class is the entry point to the application
* */
public class Main {

    public static int current = 0;
    static {
        System.out.println("Static block 1");
            current = 42;
    }// end static block


    public static void main(String[] args) {
    // This prints Hello Java
        // System.out.println("Hello Java");
        //House myHouse = new House();
        //lesson7Examples();
        // Lesson7Exercises();
        //lesson8Example();
        //Lesson8Exercises();
        // Lesson9Examples();
        //Lesson9Exercises();
        //lesson10Examples();
        //lesson11Examples();
        //lesson11Exercises();
        //lesson13Example();
        //pup();
        //dog();
        //lesson14Example();
        //lesson14Exercises();
        //lesson15Examples();
        lessonExercises15Waterbirds();
    } // end main method



    public static void lessonExercises15Waterbirds(){

        Exercises15WaterBirds myWaterBirds = new Exercises15WaterBirdsChicks("gliding and flapping",
                "Likes to Swim", "These are birds found in or very near water in aquatic");

        Exercises15WaterBirdsChicks myChicks = new Exercises15WaterBirdsChicks("Likes to Swim",
                "These are birds found in or very near water in aquatic",
                "the movements of the birds are gliding and flapping");
        myChicks.movementsOfBirds();
        myChicks.swimming();
        myChicks.wetLandHabitats();
    }


    public static void lesson15Examples(){
        int[] myInt = {1,2,3,4};
        Lesson15Base myBase = new Lesson15Sub(10,myInt,"turned off");
        Lesson15Sub mySub = new Lesson15Sub(10,myInt,"turned off");
        mySub.receiveCall();
        mySub.takePicture();
    }



    public static void lesson14Exercises(){
        Lesson14Exercises myLesson14Exercises = new Lesson14Exercises();
        int resistance = 200;
        int voltage = current * resistance;
        System.out.println(voltage);

        int current = voltage / resistance;
        System.out.println(current);

        int MyNewResistance = voltage / current;
        System.out.println(MyNewResistance);

    }



//public static void lesson14Example(){
        // can not change values of final
        //Lesson14.MY_FIRST_FINAL = 10;

       // int total = Lesson14.MY_FIRST_FINAL * 35; // 2145 * 35
       // System.out.println(total);

        // can change the value of a non-final static
      //  Lesson14.myFirstStatic = 98;  // original was 25
        //System.out.println(Lesson14.myFirstStatic);

       // Lesson14.myFirstStaticMethod(10);
       // System.out.println("block number was " +num);






    public static void dog(){
        Dog myDog = new Dog();
    }

    public static void pup(){
      Dog myDog = new Dog();
      Pup myPup = new Pup();
      myDog.dogColor(myDog.getDogColor());
      myPup.pupColor(myPup.getPupColor());
    }


public static void lesson13Example(){
        House myHouse = new House("blue");
        Condo myCondo = new Condo("medium");
        myHouse.doorOpenClose(myHouse.getDoorColor());
        myCondo.doorOpenClose(myCondo.getDoorColor());

        House myNewHouse = new Condo();
        myNewHouse.doorOpenClose();

}


    public static void lesson11Exercises(){
        Television myTelevision = new Television();
          myTelevision.turnOn();


    }

    public static void lesson11Examples() {
        House myHouse = new House();
        House myOtherHouse = new House("Red");

    }



    public static void lesson10Examples(){
        Lesson10 myLesson10 = new Lesson10();
        //myLesson10.myMethod(); // method is private and we can not see it
        Lesson10Extended myExtended = new Lesson10Extended();
        //myLesson10.myDefaultMethod(); // method is default and outside this package
        myExtended.methodFromOtherClass();
        //myLesson10.myProtectedMethod(); // method is protected and is not subclassed and outside this package

    }

    public static void Lesson9Exercises(){
       Lesson9Exercises myLesson9Exercise = new Lesson9Exercises();
       myLesson9Exercise.iceCreamFlavors();
       myLesson9Exercise.chiefsArray();
    }


    // Lesson8
    public static void Lesson9Examples(){
        Lesson9 myLesson9 = new Lesson9();
        myLesson9.basicIntArray();
        myLesson9.basicTwoDimensionalArray();
        myLesson9.basicThreeDimensionalArray();
        myLesson9.basicJaggedArray();
    }


    public static void Lesson8Exercises(){
        Lesson8Exercises myLesson8Exercises = new Lesson8Exercises();
        myLesson8Exercises.exercises8IfElse(15,20);
        myLesson8Exercises.exercises8Switch();
        myLesson8Exercises.exercises8DoWhile();


    }

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
