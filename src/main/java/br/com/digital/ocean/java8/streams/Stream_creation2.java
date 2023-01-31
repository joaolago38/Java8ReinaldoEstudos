package br.com.digital.ocean.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream_creation2 {
    public static void main(String[] args) {
        List<Integer> myList1 = new ArrayList<>();
        for(int i=0; i<10; i++) myList1.add(i);
        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<10; i++) myList.add(i);
         //sequential stream
        Stream<Integer> sequentialStream = myList1.stream();
        myList.forEach(System.out::println);
        System.out.println("=============================");
        //parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();
        System.out.println("=============================");
        myList.forEach(System.out::println);


    }
}
