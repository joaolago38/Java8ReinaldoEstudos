package br.com.reinaldo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamsCollectorJoining {
    public static void main(String [] args) {
        List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 9, 10, 10);
        String collector = asList.stream().map(e -> String.valueOf(e)).collect(Collectors.joining(";"));
        System.out.println(collector);
    }
}
