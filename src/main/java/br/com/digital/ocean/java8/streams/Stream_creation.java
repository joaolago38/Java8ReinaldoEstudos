package br.com.digital.ocean.java8.streams;

import java.util.stream.Stream;

public class Stream_creation {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4);
        stream.forEach(System.out::println);

    }
}
