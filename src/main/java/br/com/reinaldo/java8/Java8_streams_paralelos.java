package br.com.reinaldo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Java8_streams_paralelos {
    public static void main(String [] args) {
        List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5,6,6,7,8,9,9,10,10);
        asList.parallelStream().forEach(System.out::println);
        System.out.println("========================");
        System.out.println("order");
        asList.parallelStream().forEachOrdered(System.out::println);
        System.out.println("========================");
        System.out.println("findany");
        asList.stream().findAny().ifPresent(System.out::println);
        }
}
