package com.fundamentals.exercises;

public class Exercises15WaterBirdsChicks extends Exercises15WaterBirds {
    public Exercises15WaterBirdsChicks(String swimming, String wetlandHabitats, String movementsOfBirds) {
        super(swimming, wetlandHabitats, movementsOfBirds);
    }

    @Override
    public void swimming() {
        System.out.println("Likes to swim");
    }

    @Override
    public void wetLandHabitats() {
        System.out.println("These are birds found in or very near water in aquatic");
    }

    @Override
    public void movementsOfBirds() {
        System.out.println("the movements of the birds are gliding and flapping");
    }
}