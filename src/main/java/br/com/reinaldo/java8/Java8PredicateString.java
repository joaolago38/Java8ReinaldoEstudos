package br.com.reinaldo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8PredicateString {
    public static void main(String[] args) {
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
        List<String> collect = asListString.stream().filter(x -> x.contains("M")).collect(Collectors.toList());
        System.out.println(collect);
    }

}
