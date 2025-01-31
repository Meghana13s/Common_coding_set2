package com.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Frequency {



    public static void main(String[] args) {
        String s = "meghana";

        List<String> ss = Arrays.asList("meghana","meghana","sinchana");
        ss.stream().collect(Collectors.groupingBy(Function.identity(),HashMap::new,Collectors.counting())).entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey()).forEach(System.out::println);

        char[] charArray = s.toCharArray();
        HashMap<Integer, Long> collect1 = s.chars().mapToObj(c -> c).collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
        HashMap<Character, Long> collect = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
        List<Character> collect2 = collect.entrySet().stream().filter(c -> c.getValue() > 1).map(c -> c.getKey()).collect(Collectors.toList());
        List<Map.Entry<Character, Long>> collect3 = collect.entrySet().stream().filter(c -> c.getValue() > 1).collect(Collectors.toList());

        System.out.println(collect3);

        // without counts

        Set<String> duplicates = new HashSet<>();
        Set<String> seen  = new HashSet<>();

       for(String j:ss) {
           if(!seen.add(j)) {
               duplicates.add(j);
           }

       }

       System.out.println(duplicates);

    }
    // find the first repeated character in a string
    // make use of linkedhashmap here

}
