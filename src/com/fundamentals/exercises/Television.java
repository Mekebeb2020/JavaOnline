package com.fundamentals.exercises;


public class Television {

    private int screenSize;
    private int price;
    private String port;
    private String isMountable;

    public Television(String port, String isMountable) {

    }

    public Television() {
        this("HDMI","wall");
        System.out.println("This is the default constructor");
    }

    public void turnOn(){
        System.out.println("The tv is turned on");
    }

    public Television(String port,String isMountable, int screenSize, int price){
        this.screenSize = screenSize;
        this.price = price;
        this.port = port;
        this.isMountable = isMountable;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getScreenSize(){
        return screenSize;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice(){
        return price;
    }


    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getIsMountable() {
        return isMountable;
    }

    public void setIsMountable(String isMountable) {
        this.isMountable = isMountable;
    }
}
