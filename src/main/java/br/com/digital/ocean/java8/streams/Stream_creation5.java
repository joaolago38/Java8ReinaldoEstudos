package br.com.digital.ocean.java8.streams;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_creation5 {
    public static void main(String[] args) {
        Stream<Integer> intStream = Stream.of(1,2,3,4);
        List<Integer> intList = intStream.collect(Collectors.toList());
        intList.forEach(System.out::println);
        System.out.println("========================================"); //prints [1, 2, 3, 4]

        intStream = Stream.of(1,2,3,4); //stream is closed, so we need to create it again
        Map<Integer,Integer> intMap = intStream.collect(Collectors.toMap(i -> i, i -> i+10));
        System.out.println("========================================");
        System.out.println(intMap); //prints {1=11, 2=12, 3=13, 4=14}

    }
}
