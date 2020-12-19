package com.fundamentals;

public class House {

   private String foundation;
   private String roofType;
   private String doorColor;
   private int windowSize;

    public House(){
        this("white");
        System.out.println("This is the default constructor");
    }

    public House(String doorColor){
        this("concrete","composite",doorColor,23);
       System.out.println("the door color is "+ doorColor);
    }

    public House(String foundation,String roofType, String doorColor, int windowSize){
        this.foundation = foundation;
        this.roofType = roofType;
        this.doorColor = doorColor;
        this.windowSize = windowSize;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public String getFoundation(){
        return foundation;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public String getRoofType(){
        return roofType;
    }

    public void doorOpenClose() {}

    public String getDoorCover() {
        return doorColor;
    }

    public void setDoorCover(String doorCover) {
        this.doorColor = doorCover;
    }

    public int getWindowSize() {
        return windowSize;
    }

    public void setWindowSize(int windowSize) {
        this.windowSize = windowSize;
    }
}
