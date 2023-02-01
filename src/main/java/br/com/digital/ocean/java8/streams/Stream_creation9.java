package br.com.digital.ocean.java8.streams;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_creation9 {
    public static void main(String[] args) {
        Stream<String> names2 = Stream.of("aBc", "d", "ef", "123456");
        List<String> reverseSorted = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSorted); // [ef, d, aBc, 123456]

        Stream<String> names3 = Stream.of("aBc", "d", "ef", "123456");
        List<String> naturalSorted = names3.sorted().collect(Collectors.toList());
        System.out.println(naturalSorted); //[123456, aBc, d, ef]

    }
}
