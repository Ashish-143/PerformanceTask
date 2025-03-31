package org.example.Generics;

import java.util.List;

public class GenericBoundedType{
    public static <T extends Comparable<T>> T max(T first,T second){
        if(first==null && second==null) throw new IllegalArgumentException("Both elements cannot be null.");
        if(first==null) return second;
        if(second==null) return first;
        return first.compareTo(second)>=0? first:second;
    }
}
