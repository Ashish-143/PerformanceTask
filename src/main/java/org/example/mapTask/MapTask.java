package org.example.mapTask;

import java.time.temporal.Temporal;
import java.util.*;
public class MapTask {

    public void mapCityPop(){
        Map<String,Long> infoMap=new HashMap<>();
        infoMap.put("Hyderabad",742384L);
        infoMap.put("Bokaro",42312L);
        infoMap.put("Bangalore",6439503L);
        infoMap.put("Ranchi",423523L);

        for(Map.Entry<String,Long> map: infoMap.entrySet()){
            System.out.println("City name: "+map.getKey()+" and population: "+map.getValue());
        }
    }

    public void treeContentCopy(){
        TreeMap<Integer, String> vehicleMap = new TreeMap<>();
        vehicleMap.put(1, "Car");
        vehicleMap.put(3, "Motorbike");
        vehicleMap.put(2, "Truck");
        vehicleMap.put(4, "Bicycle");

        TreeMap<Integer,String> copiedMap=new TreeMap<>(vehicleMap);
        for(Map.Entry<Integer,String> map: copiedMap.entrySet()){
            System.out.println("Number: "+map.getKey()+" and name: "+map.getValue());
        }
    }

    public void personMap(){
        Map<String,Double> person=new TreeMap<>();
        person.put("Bob",6.0);
        person.put("Alice",5.6);
        person.put("Charlie",5.9);


        //removal of person
        person.remove("Charlie");

        //printing of map
        for(Map.Entry<String,Double> map: person.entrySet()){
            System.out.println("Name: "+map.getKey()+" height: "+map.getValue());
        }

    }

    public void operations(){
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,19);
        map.put(2,16);
        map.put(3,24);
        map.put(4,21);
        map.put(5,26);

        //get a key and value
        map.get(2);

        //delete all elements
        System.out.println("Map after deletion: ");
        map.clear();
    }

    public void clearKeyRange(int start,int end){
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,19);
        map.put(2,16);
        map.put(3,24);
        map.put(4,21);
        map.put(5,26);

        Set<Integer> set=map.keySet();
        for(Integer i:set){
            if(i>=4 && i<10) map.remove(i);
        }
    }
    public static void main(String[] args) {
        MapTask mapTask=new MapTask();

        //Task1
        mapTask.mapCityPop();

        //Task2
        mapTask.treeContentCopy();

        //Task3
        mapTask.operations();

        //Task4
        mapTask.personMap();

        //Task5
        mapTask.clearKeyRange(4,10);
    }
}
