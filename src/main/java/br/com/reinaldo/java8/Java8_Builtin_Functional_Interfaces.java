package br.com.reinaldo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Java8_Builtin_Functional_Interfaces {
    public static void main(String[] args) {
        Stream.generate(() -> new Random().nextInt()).limit(5).forEach(System.out::println);

        List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5);
        asList.stream().filter(e -> e % 2 == 0).map(e -> e.doubleValue()).reduce((e1,e2) ->  e1 + e2).ifPresent(System.out::println);



    }


}
