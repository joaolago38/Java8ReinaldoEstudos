package br.com.digital.ocean.java8.streams;

import java.util.stream.Stream;

public class Stream_creation3 {
    public static void main(String[] args) {
//        Stream<String> stream1 = Stream.generate(() -> {return "abc";});
        Stream<String> stream2 = Stream.iterate("abc", (i) -> i);
        System.out.println("=============================");
//        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);
    }
}
