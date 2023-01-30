package br.com.reinaldo.java8;

import java.util.stream.IntStream;

public class Java8_LambdaFuncoes {

    public static void main(String[] args) {
        // parenteses
        Runnable runnable = () -> System.out.println("Se inscreva no canal");
        IntStream.range(0,5).filter((int n ) -> n % 2 == 0 )
                .reduce((n1,n2) -> n1 + n2).ifPresent(System.out::println);
        //  chaves
        IntStream.range(0,5).filter((int n ) -> {return  n % 2 == 0 ;} ).forEach(System.out::println);


    }
}
