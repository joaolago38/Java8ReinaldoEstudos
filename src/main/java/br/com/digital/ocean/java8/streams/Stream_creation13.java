package br.com.digital.ocean.java8.streams;


import java.util.stream.Stream;

public class Stream_creation13 {
    public static void main(String[] args) {
        Stream<Integer> numbers2 = Stream.of(1,2,3,4,5);
        numbers2.limit(3).forEach(i -> System.out.print(i+ "," )); //1,2,3,4,5,
    }
}
