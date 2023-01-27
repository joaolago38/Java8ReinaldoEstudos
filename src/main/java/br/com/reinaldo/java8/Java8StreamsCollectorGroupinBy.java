package br.com.reinaldo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8StreamsCollectorGroupinBy {
    public static void main(String [] args) {
        List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 9, 10, 10);
        Map<Boolean, List<Integer> > mapa = asList.stream().map(e -> e * 3).collect(Collectors.groupingBy(e -> e % 2==0));
        System.out.println(mapa);
    }
}
