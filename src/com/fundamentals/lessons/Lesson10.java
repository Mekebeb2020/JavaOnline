package com.fundamentals.lessons;

/*
* This class will go over the Lesson 10 content
*
* */

public class Lesson10 {

    // This method demonstrates a use of the private access modifier
    private void myMethod(){
        System.out.println("myMethod is a private method.");
    } // end method my method

    // This method demonstrate a use of the default access modifier
    void myDefaultMethod(){
        System.out.println("Method from a default access modifier");
        System.out.println("The next statement comes from a private method");
        myMethod();
    } // end method my default method

    // This method demonstrates a use of the protected modifier
    protected void myProtectedMethod(){
        System.out.println("myProtected method is using the protected modifier");
    }

} // end class
