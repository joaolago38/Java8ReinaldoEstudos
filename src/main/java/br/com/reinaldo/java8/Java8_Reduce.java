package br.com.reinaldo.java8;

import java.util.Arrays;
import java.util.List;

public class Java8_Reduce {
    public static void main(String [] args) {
        List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5,6);
        asList.stream().forEach(System.out::println);
    }
}
