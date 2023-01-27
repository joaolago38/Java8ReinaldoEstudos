package br.com.reinaldo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamsCollector {
    public static void main(String [] args) {
        List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5,6,6,7,8,9,9,10,10);
        List<Integer> novaNovaLista = asList.stream().limit(5).filter((e -> e % 2 == 0)).map(e -> e*3).collect(Collectors.toList());
        System.out.println(novaNovaLista);
    }
}
