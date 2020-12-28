package com.fundamentals.exercises;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class Lesson17Exercises {

    public void Exercises17ArrayList(){
        ArrayList<Television> myTelevision = new ArrayList<>();
        myTelevision.add(new Television("HDMI","wall"));
        myTelevision.add(new Television("Component","On Table"));
        myTelevision.add(new Television("S-Video","On TV stand"));

        for(int i = 0; i < myTelevision.size(); i++){
            System.out.println(myTelevision.get(i).getPort());

        }
    }
    public void exercises17HashSet() {
        HashSet<String> myHash = new HashSet<>();
        myHash.add("Concrete");
        myHash.add("Composite");
        myHash.add("25");

        Iterator<String> iterator = myHash.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void Exercise17HashMap(){
        Map<Integer,String> myMap = new HashMap<>();
        myMap.put(1,"The Foundation is concrete");
        myMap.put(2,"The roof type is composite");


        for(Map.Entry<Integer, String> map : myMap.entrySet()) {
            System.out.println(map.getKey() +" = "+map.getValue());
        } // End for

    } // End Exercises 17 Hash Map method
} // End Class
