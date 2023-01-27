package br.com.reinaldo.java8;

import java.util.Arrays;
import java.util.List;

public class Java8Streams {
    public static void main(String [] args) {
        List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5,6,6,7,8,9,9,10,10);

        // fluxo de dados -> streams
        asList.stream().skip(2) // operacao intermediaria
                .forEach( e -> System.out.println( "impresso pelo streans skip : " + e));
        System.out.println("=============================================================");
        asList.stream().limit(3) // operacao intermediaria
                .forEach( e -> System.out.println( "impresso pelo streans  limite :" + e));
        System.out.println("=============================================================");
        asList.stream().distinct()// operacao intermediaria
                .forEach( e -> System.out.println( "impresso pelo streans  distinct :" + e));
        System.out.println("=============================================================");
        asList.stream().limit(4).map( e  -> e * 3)// operacao intermediaria
                .forEach( e -> System.out.println( "impresso pelo streans  map :" + e));
        System.out.println("=============================================================");

        // operacoes finais




    }
}
