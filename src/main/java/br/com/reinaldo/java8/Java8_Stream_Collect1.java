package br.com.reinaldo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8_Stream_Collect1 {
    public static void main(String [] args) {
        List<Integer> asList = Arrays.asList(1,2,3,4,5,6);
        // fornecedor - acumulador - combinaçao
       List<Integer>  collector = asList.stream().collect(() -> new ArrayList<>(), (l , e) -> l.add(e) ,(l1,l2) ->l1.addAll(l2));
        System.out.println(collector);


    }
}
