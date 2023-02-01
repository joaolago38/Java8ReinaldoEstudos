package br.com.digital.ocean.java8.streams;


import java.util.Optional;
import java.util.stream.Stream;

public class Stream_creation12 {
    public static void main(String[] args) {
        Stream<Integer> numbers1 = Stream.of(1,2,3,4,5);
        System.out.println("Number of elements in stream="+numbers1.count()); //5
        Stream<String> stringValues = Stream.of("a","b");
        System.out.println("Number of elements in stream=" + stringValues.count()); //5
    }
}
