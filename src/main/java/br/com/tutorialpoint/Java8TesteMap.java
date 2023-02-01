package br.com.tutorialpoint;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8TesteMap {
    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3,4,6,6, 7, 3, 5);
        //get list of unique squares
        List<Integer> squaresList = numbers.stream().map(i -> i*i).distinct().limit(4).collect(Collectors.toList());
        squaresList.forEach(System.out::println);
    }
}
