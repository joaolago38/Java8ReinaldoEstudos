package br.com.reinaldo.java8;

import java.util.Optional;

public class Java8_Optional {
    public static void main(String[] args) {
        String s = "Inscrever no canal";
        Optional<Integer> numero = converteEmNumeros(s);

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
