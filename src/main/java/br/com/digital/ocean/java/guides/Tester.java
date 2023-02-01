package br.com.digital.ocean.java.guides;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tester {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("java", "c", "python");

        List<String> result = lines.stream()       // convert list to stream
                .filter(line -> "java".contains(line)) // we dont like c
                .collect(Collectors.toList());     // collect the output and convert streams to a List

        result.forEach(System.out::println);
    }

}
