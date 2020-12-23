package com.fundamentals.lessons;

/*
*  The following contents is covering lesson 15
*  Abstract
* */
public abstract class Lesson15Base implements Lesson15Interface{

    private int volume;
    private int [] numberKey;
    private String screen;

    public Lesson15Base(int vol, int[]nKey, String screen){
        this.volume = vol;
        this.numberKey = nKey;
        this.screen = screen;

    }

    public int getVolume() {
        return volume;
    }

    public int[] getNumberKey() {
        return numberKey;
    }

    public String getScreen() {
        return screen;
    }

    public abstract void receiveCall();
    public abstract void sendCall();
    public abstract void endCall();

    public void takePicture(){
        System.out.println("taking a picture ");
    }
}
