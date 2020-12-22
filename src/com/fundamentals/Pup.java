package com.fundamentals;

public class Pup extends Dog{
    private String likesToys;
    private String pupColor;

    public Pup(){
        System.out.println("Default pup constructor");
    }

    public Pup(String likesToys){
        this.likesToys = likesToys;
    }

    public Pup(String eatMeat,String bark, String faithful, String canSmellCancer, String goodGuard, String likesToys){
        super(eatMeat, bark,faithful,canSmellCancer,goodGuard);
        this.likesToys = likesToys;
    }

    public void pupColor() {
        System.out.println("My dog color is black and white");
    }
    public void pupColor(String dogColor){
        System.out.println("my dog color is "+pupColor);
    }


    public String getLikesToys() {
        return likesToys ;
    }

    public void setLikesToys(String pupColor) {
        this.likesToys = likesToys;
    }

    public String getPupColor() {
        return pupColor ;
    }

    public void setPupColor(String pupColor) {
        this.pupColor = pupColor;
    }



    @Override
    public void dogColor(){
        super.dogColor();
        System.out.println("my gog color is black ");
    }
    @Override
    public void dogColor(String dogColor){
        System.out.println("the my dog color is "+dogColor);
    }



}
