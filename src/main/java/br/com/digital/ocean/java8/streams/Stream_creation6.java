package br.com.digital.ocean.java8.streams;


import java.util.Arrays;
import java.util.stream.Stream;

public class Stream_creation6 {
    public static void main(String[] args) {
        Stream<Integer> intStream = Stream.of(1,2,3,4);
        Integer[] intArray = intStream.toArray(Integer[]::new);
        System.out.println(Arrays.toString(intArray)); //prints [1, 2, 3, 4]

    }
}
