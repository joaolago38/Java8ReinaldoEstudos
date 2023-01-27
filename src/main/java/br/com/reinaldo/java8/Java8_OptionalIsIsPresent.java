package br.com.reinaldo.java8;

import java.util.Optional;

public class Java8_OptionalIsIsPresent {

    public static void main(String[] args) {
//        String s = "inscrever no canal";
        String s = "1";
        Optional<Integer> numero = converteEmNumeros(s);
        numero.ifPresent(e ->  System.out.println(e));
    }

    public static Optional<Integer> converteEmNumeros(String numeroStr) {
        try {
            Integer integer = Integer.valueOf(numeroStr);
            return Optional.of(integer);
        } catch (Exception e) {
            return  Optional.empty();
        }

    }
}
