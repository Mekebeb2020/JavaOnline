package com.fundamentals.exercises;

public abstract class Exercises15WaterBirds implements Exercises15MovementInterface {
    private String swimming;
    private String wetlandHabitats;
    private String movementsOfBirds;
    public Exercises15WaterBirds(String movementsOfBirds, String swimming, String wetlandHabitats ){
        this.swimming = swimming;
        this.wetlandHabitats = wetlandHabitats;
        this.movementsOfBirds = movementsOfBirds;
    }

    public String getSwimming() {
        return swimming;
    }

    public String getWetlandHabitats() {
        return wetlandHabitats;
    }

    public String getMovementsOfBirds() {
        return movementsOfBirds;
    }
    public abstract void swimming();
    public abstract void wetLandHabitats();



}
