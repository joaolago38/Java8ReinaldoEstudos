package br.com.tutorialpoint;

import java.util.Random;

public class Java8TesterLimit {
    public static void main(String args[]) {
        Random random = new Random();
        random.ints().distinct().limit(10).forEach(System.out::println);
    }
}
