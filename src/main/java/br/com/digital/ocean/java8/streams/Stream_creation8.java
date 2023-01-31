package br.com.digital.ocean.java8.streams;


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_creation8 {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");
        System.out.println(names.map(s -> {
            return s.toUpperCase();
        }).collect(Collectors.toList()));
        //prints [ABC, D, EF]

    }
}
