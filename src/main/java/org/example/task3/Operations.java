package org.example.task3;

import java.util.ArrayList;
import java.util.List;

public class Operations {
    public static void main(String[] args) {
        List<Integer> list1=List.of(1,2,3,4,5,6);
        List<Integer> list2=List.of(8,4,9,10,11,2,3);

        //Part1
        System.out.println(list1.equals(list2));

        //Part2
        list1.addAll(list2);


    }
}
