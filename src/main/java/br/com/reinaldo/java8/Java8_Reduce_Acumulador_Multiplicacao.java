package br.com.reinaldo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8_Reduce_Acumulador_Multiplicacao {
    public static void main(String [] args) {
        List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5,6);
      Optional<Integer> multiplicacao = asList.stream().reduce((n1 , n2) -> n1  * n2);
      System.out.println(multiplicacao.get());
    }
}
