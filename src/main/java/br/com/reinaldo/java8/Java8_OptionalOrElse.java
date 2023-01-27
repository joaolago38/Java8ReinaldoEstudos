package br.com.reinaldo.java8;

import java.util.Optional;

public class Java8_OptionalOrElse {

    public static void main(String[] args) {
        String s = "inscrever no canal";
//        String s = "1";
        Integer numero = converteEmNumeros(s).orElse(2);
        System.out.println(numero);

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
