package br.com.digital.ocean.java8.streams;


import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Stream_creation4 {
    public static void main(String[] args) {
        LongStream fis = Arrays.stream(new long[]{1,2,3,4});
        IntStream is2 = "abc".chars();
        fis.forEach(System.out::println);
        System.out.println("=============================");
        is2.forEach(System.out::println);

    }
}
