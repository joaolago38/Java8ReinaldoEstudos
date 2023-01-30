package br.com.reinaldo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Java8_collections {
    public static void main(String [] args) {
        List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5,6,6,7,8,9,9,10,10);
        List<Integer> asList2 = new ArrayList<>();
        asList2.add(1);
        asList2.add(2);
        asList2.add(3);
        asList2.add(4);
        asList2.add(6);
        asList2.add(5);
        asList2.forEach( n -> System.out.println(n));
        System.out.println("========================");
        System.out.println("removeif");
        asList2.removeIf( n -> n % 2 == 0);
        asList2.forEach( n -> System.out.println(n));
        System.out.println("========================");
        System.out.println("removeall");
        asList2.replaceAll( n -> n * 2);
        asList2.forEach( n -> System.out.println(n));
        System.out.println("========================");
        System.out.println("Hashmap");
        HashMap<Integer,String> map = new HashMap<>();
        map.put(0,"se");
        map.put(1,"increva ");
        map.put(2,"no");
        map.put(3,"canal");
        //compute
        map.compute(1, (k,v) -> v + "agora");
        System.out.println("impressao do compute");
        map.forEach((k,v) -> System.out.println (" k =>" + k + " V =>" + v));
        // merge
        map.merge(3,"!",(v1,v2) -> v1 + v2);
        System.out.println("impressao do merge");
        map.forEach((k,v) -> System.out.println (" k =>" + k + " V =>" + v));
        System.out.println("impressao do replaceall");































    }
}
