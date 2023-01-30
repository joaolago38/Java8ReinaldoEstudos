package br.com.reinaldo.java8;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8_Streams_Creation {
    public static void main(String[] args) throws IOException {
        // Collections

            List<Integer> asList = Arrays.asList(1,2,3,4,5);
            asList.stream().forEach(System.out::println);

            // arrays

//         Integer [] arrayInteger = new Integer[]{1,2,3,4,5};
//
//
//        Arrays.stream(arrayInteger).forEach(System.out::println);
//
//        // Stream.of
//
//        Stream.of("se","Inscreva","canal").forEach(System.out::println);
//
//        IntStream.range(0,5).forEach(System.out::println);
//        Stream.iterate(5, n-> n*2).forEach(System.out::println);
//
//        
//        
//         // stream.txt - 11,12,13
//        // File file = new File("stream.txt");
//        FileReader in = new FileReader(file);
//        BufferedReader rd = new BufferedReader(in);
//        rd.lines().limit(5).forEach(System.out::println);


        // file

        Path p = Paths.get("");
        Files.list(p).forEach(System.out::println);

        // random

        new Random().ints().limit(10).forEach(System.out::println);

        // pattern
        String s = "Deixe um curtir no video" ;
        Pattern ps = Pattern.compile(" ");
        ps.splitAsStream(s).forEach(System.out::println);





    }


}
