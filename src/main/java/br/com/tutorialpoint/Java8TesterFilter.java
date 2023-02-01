package br.com.tutorialpoint;

import java.util.Arrays;
import java.util.List;

public class Java8TesterFilter {
    public static void main(String args[]) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

//get count of empty string
        strings.stream().filter(string -> string.isEmpty()).count();
        strings.forEach(System.out::println);
    }
}
