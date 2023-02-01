package br.com.digital.ocean.java8.streams;


import java.util.Optional;
import java.util.stream.Stream;

public class Stream_creation11 {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1,2,3,4,5);

        Optional<Integer> intOptional = numbers.reduce((i, j) -> {return i*j;});
        if(intOptional.isPresent()) System.out.println("Multiplication = "+intOptional.get());
    }
}
