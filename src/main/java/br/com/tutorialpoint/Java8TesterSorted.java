package br.com.tutorialpoint;

import java.util.Random;

public class Java8TesterSorted {
    public static void main(String args[]) {
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
    }
}
