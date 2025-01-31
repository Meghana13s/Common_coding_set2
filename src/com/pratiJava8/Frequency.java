package com.pratiJava8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {

    public static void main(String[] args) {
        String s ="meghanam";

        HashMap<Character, Long> collect = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(collect);
        /////
        collect.entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey()).forEach(System.out::println);



























































































































    }
}
