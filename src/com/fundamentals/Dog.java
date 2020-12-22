package com.fundamentals;

public class Dog {

    private String eatMeat;
    private String bark;
    private String faithful;
    private String canSmellCancer;
    private String goodGuard;

    public Dog(){
        System.out.println("This is the default constructor");
    }

    public Dog(String eatMeat,String bark, String faithful, String canSmellCancer, String goodGuard){
        this.eatMeat = eatMeat;
        this.bark = bark;
        this.faithful = faithful;
        this.getCanSmellCancer();
        this.getGoodGuard();


    }

    public void setEatMeat(String eatMeat) {
        this.eatMeat = eatMeat;
    }

    public String getEatMeat(){
        return eatMeat;
    }

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }

    public String getFaithful() {
        return faithful;
    }

    public void setFaithful(String faithful) {
        this.faithful = faithful;
    }

    public String getCanSmellCancer() {
        return canSmellCancer;
    }

    public void setCanSmellCancer(String canSmellCancer) {
        this.canSmellCancer = canSmellCancer;
    }

    public String getGoodGuard() {
        return goodGuard;
    }

    public void setGoodGuard(String goodGuard) {
        this.goodGuard = goodGuard;
    }
}



