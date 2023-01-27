package br.com.reinaldo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8_Reduce_Math_min {
    public static void main(String [] args) {
        String s = "Inscreva-se no canal e compartilhe este video";
        String [] split  =  s.split("");
        List<String> listString = Arrays.asList(split);
        
      Optional<String> contenacao = listString.stream().reduce((s1 , s2) -> s1.concat(s2));
      System.out.println(contenacao.get());
    }
}
