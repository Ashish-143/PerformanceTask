package org.example.listTasks1;

import java.util.*;

public class ListTask {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);

        //Task1
        list.trimToSize();

        //Task2
        Collections.replaceAll(list,10,40);
        System.out.println(list);

        //Task3
        Map<Integer,Integer> integerMap=new HashMap<>();
        for(Integer i: list){
            integerMap.put(integerMap.getOrDefault(i,0),1 );
        }
        System.out.print("Duplicate values: ");
        for(Map.Entry<Integer,Integer> map: integerMap.entrySet()){
            if(map.getValue()>1) System.out.print(map.getKey()+" ");
        }
        System.out.println();

        //Task4
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(10);
        list.add(22);
        list.add(30);
        list.add(15);
        Set<Integer> set1 = new HashSet<>(list);
        set1.addAll(list2);
        System.out.println("Unique elements: "+set1);

        //Task5
        Set<Integer> generatedSet=new HashSet<>(list);
        List<Integer> generatedList=new ArrayList<>(set1);
        System.out.println("Set from list: "+generatedSet);
        System.out.println("List from set: "+generatedList);

        //Task6
        int rotateCount=2;
        Collections.rotate(list,-2);
        System.out.println("Rotated list: "+list);
    }
}

