package br.com.tutorialpoint;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Tester5 {
    public static void main(String args[]) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        strings.forEach(System.out::println);
        filtered.forEach(System.out::println);

    }
}
