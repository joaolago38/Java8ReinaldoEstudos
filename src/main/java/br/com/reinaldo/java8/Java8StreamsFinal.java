package br.com.reinaldo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8StreamsFinal {
    public static void main(String [] args) {
        List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5,6,6,7,8,9,9,10,10);
        List<String> asListString = Arrays.asList("Penelope","Nick","Ed","Jennifer",
                "Johnny","Bette","Grace","Matthew",
                "Joe","Christian","Zero","Karl",
                "Uma","Vivien","Cuba","Fred",
                "Helen","Dan","Bob","Lucille","Kirsten",
                "Elvis","Sandra","Cameron","Kevin","Rip",
                "Julia","Woody","Alec","Sandra","Sissy",
                "Tim","Milla","Audrey","Judy","Burt",
                "Val","Tom","Goldie","Johnny","Jodie",
                "Tom","Kirk","Nick","Reese","Parker",
                "Julia","Frances","Anne","Natalie",
                "Gary","Carmen","Mena","Penelope","Fay",
                "Dan","Jude","Christian","Dustin","Henry",
                "Christian","Jayne","Cameron","Ray","Angela",
                "Mary","Jessica","Rip","Kenneth","Michelle",
                "Adam","Sean","Gary","Milla","Burt","Angelina",
                "Cary","Groucho","Mae","Ralph","Scarlett",
                "Woody","Ben","James","Minnie","River",
                "Greg","Spencr","Kenneth","Charlize",
                "Sean","Christopher",
                "Kirsten","Ellen","Kenneth","Daryl","Gene",
                "Meg","Chris","Jim","Spencer","Susan","Walter",
                "Matthew","Penelope","Siney","Groucho","Gia",
                "Warren","Sylvester","Susan","Cameron","Russell",
                "Morgan","Morgan","Harrison","Dan","Renee","Cuba",
                "Warren","Penelope","Liza","Salma","Julianne","Scarlett",
                "Albert","Frances","Kevin","Cate","Daryl","Greta","Jane",
                "Adam","Richard","Gene","Rita","Ed","Morgan","Lucille",
                "Ewan","Whoopi","Cate","Jada","Angela","Kim","Albert",
                "Fay","Emily","Russell","Jayne","Geoffrey","Ben",
                "Minnie","Meryl","Ian","Fay","Greta","Vivien","Laura","Chris",
                "Harvey","Oprah","Christopher","Humphrey","Al",
                "Nick","Laurence","Will","Kenneth","Mena",
                "Olympia","Groucho","Alan","William",
                "Jon","Gene","Lisa","Ed","Jeff","Matthew",
                "Debbie","Russell","Humphrey","Michael",
                "Julia","Renee","Rock","Cuba","Audrey",
                "Gregory","John","Burt","Meryl","Jayne",
                "Bela","Reese","Mary","Julia","Thora");
        List<String> result = getFilterOutput(asListString, "Meryl");
        for (String temp : result) {
            System.out.println(temp);    //output : spring, node
        }
        System.out.println("================================================");


        System.out.println("================================================");
        Stream<Integer> map = asList.stream().limit(3).map( e -> e * 2);
        map.forEach( e -> System.out.println(e));

        System.out.println("================================================");
        long count = asList.stream().map(e ->  e * 2).count();
        System.out.println(count);




    }

    private static List<String> getFilterOutput(List<String> asListString, String filter) {
        List<String> result = new ArrayList<>();
        for (String line : asListString) {
            if (!"mkyong".equals(line)) { // we dont like mkyong
                result.add(line);
            }
        }
        return result;
    }
}
