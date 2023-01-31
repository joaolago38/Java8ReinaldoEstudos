package br.com.digital.ocean.java8.streams;

import java.util.Arrays;
import java.util.List;

public class Java8_Streans {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5,6);
        sumStream(list);
        System.out.println(list);
    }
    private static int sumStream(List<Integer> list) {
        return list.stream().filter(i -> i > 5).mapToInt(i -> i).sum();
    }
}
