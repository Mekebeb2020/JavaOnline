package com.fundamentals;

/*
* This class is a sub class of House
* part of lesson 12
* */
public class Condo extends House{
    private String balcony;

     public Condo() {
         System.out.println("Default condo constructor");
     }
        public Condo(String balcony) {
         this.balcony = balcony;
    }
    public String getBalcony() {
         return balcony;
    }

    public void setBalcony(String balcony) {
         this.balcony = balcony;
    }
    public void maintenence(){
         System.out.println("will fix condo issues");
    }

}
