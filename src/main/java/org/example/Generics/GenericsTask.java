package org.example.Generics;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

public class GenericsTask {
    public static <T> int count(List<T> elements, Predicate<T> predicate){
        int count=0;
        for(T element: elements){
            if(predicate.test(element)) count++;
        }
        return count;
    }

    public static boolean isOdd(Integer n){
        return n % 2 == 1;
    }

    public static boolean isPrime(Integer n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }


    public static boolean isPallindrome(String s){
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }

    public static <T> void exchange(T[] array, int pos1,int pos2){
        if(pos1<0 || pos1>= array.length || pos2<0 || pos2>= array.length) throw new ArrayIndexOutOfBoundsException("Enter the positions between the valid range.");
        T temp=array[pos1];
        array[pos1]=array[pos2];
        array[pos2]=temp;
    }

    public static <T extends Number> void sumOfOddEven(List<T> numbers){
        double oddSum=0,evenSum=0;
        for(T number: numbers){
            if(number.doubleValue()%2==0) evenSum+=number.doubleValue();
            else oddSum+=number.doubleValue();
        }
        System.out.println("Sum of odd numbers: "+oddSum+" sum of even numbers: "+evenSum);
    }

    public static <T> int indexOf(List<T> elements, T target){
        for(int i=0;i<elements.size();i++){
            if(target==elements.get(i)) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        //Task1
        List<Integer> integers=List.of(1,2,3,4,5,6);
        System.out.println("Total count of odd numbers: "+count(integers,GenericsTask::isOdd));
        System.out.println("Total count of prime numbers: "+count(integers,GenericsTask::isPrime));
        List<String> strings=List.of("cionrnf","radar","lal","babul","tatat");
        System.out.println("Total count of pallindromes : "+count(strings,GenericsTask::isPallindrome));

        //Task2
        Integer[] integerss={2,3,6,1,9};

        System.out.println("Position exchanged from 2 to 4: ");
        exchange(integerss,1,3);
        System.out.println(java.util.Arrays.toString(integerss));

        //Task3
        List<Number> numbers= List.of(1,23,4,5,9);
        sumOfOddEven(numbers);

        //Task4
        List<Character> characters=List.of('a','b','c','a','b');
        System.out.println("Index of c: "+indexOf(characters,'c'));

        //Task5
        Double first=4.6;
        Double second=9.4;

        System.out.println("Greater elements between "+first+" and "+second+": "+GenericBoundedType.max(first,second));
    }

}
