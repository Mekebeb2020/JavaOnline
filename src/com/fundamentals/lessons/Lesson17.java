package com.fundamentals.lessons;

/*
* The java.util.* should not be used in favor of individual imports
* dou to memory limitation. You don't need imports of classes you will
* never use.
* This class goes over Lesson 17 content
* Collections Framework
*/

import com.fundamentals.House;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Lesson17 {

    // this method will show an ArrayList of string
    public void exampleArrayList1() {
        List<String> list = new ArrayList<>();
        list.add("Happy");
        list.add("Tuesday");
        list.add("Not Monday");
        list.add("Where\'s Friday");


        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        } // End for loop
    } // End method example array list 1

    // This method will show an ArrayList of house
    public void exampleArrayList2() {
        ArrayList<House> myHouses = new ArrayList<House>();
        myHouses.add(new House("Red"));
        myHouses.add(new House("Green"));
        myHouses.add(new House("Blue"));
        myHouses.add(new House("white"));

        for(int i = 0; i < myHouses.size(); i++){
            System.out.println(myHouses.get(i).getDoorColor());
        } // End for for
    }// end method example array list 2

    // This method will show a Hashset example
        public void exampleHashSet() {
            HashSet<String> myHash = new HashSet<>();
            myHash.add("Firecrackers");
            myHash.add("Sparklers");
            myHash.add("Fountains");

            Iterator<String> iterator = myHash.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        } // end method example hashset

    // This method will show a map example
    public void exampleHashMap(){
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(10,"Happy");
        myMap.put(20, "Days");
        myMap.put(30, "are you here");
        myMap.put(40, "Happy");

        for(Map.Entry<Integer, String> map : myMap.entrySet()) {
            System.out.println(map.getKey() +" = "+map.getValue());
        } // end for
    } // end method example hash map

} // End Class
