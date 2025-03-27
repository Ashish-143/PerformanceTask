package org.example.setTask;

import javax.sound.midi.SysexMessage;
import java.util.*;

public class SetTask {
    public void yearIteration(){
        Set<Integer> set=new HashSet<>();
        set.add(1920);
        set.add(1234);
        set.add(2024);
        set.add(2025);

        Iterator<Integer> iterator=set.iterator();
        System.out.println("Iterating through iterator: ");
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
            System.out.println();
        }
        System.out.println("The order preservation is not confirmed.");
    }

    public void differentSetIteration(){
        Set<Integer> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(20);
        linkedHashSet.add(8);
        linkedHashSet.add(10);

        Set<Integer> treeSet=new TreeSet<>();
        treeSet.add(9);
        treeSet.add(7);
        treeSet.add(17);
        treeSet.add(81);

        Iterator<Integer> iterator1=linkedHashSet.iterator();
        while(iterator1.hasNext()){
            System.out.print(iterator1.next()+" ");
        }
        System.out.println();
        System.out.println("In linkedHashSet the order is maintained as per the insertion order.");

        Iterator<Integer> iterator2=treeSet.iterator();
        while(iterator2.hasNext()){
            System.out.print(iterator2.next()+" ");
        }
        System.out.println();
        System.out.println("In treeset order is maintained by increasing order.");
    }

    public static void main(String[] args) {
        SetTask setTask=new SetTask();

        //Task1
        setTask.yearIteration();

        //Task2
        setTask.differentSetIteration();


    }
}
