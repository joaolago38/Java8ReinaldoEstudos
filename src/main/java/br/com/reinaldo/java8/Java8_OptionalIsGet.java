package br.com.reinaldo.java8;

import java.util.Optional;

public class Java8_OptionalIsGet {

    public static void main(String[] args) {
        String s = "inscrever no canal";
        Optional<Integer> numero = converteEmNumeros(s);
        System.out.println(numero.get());
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
