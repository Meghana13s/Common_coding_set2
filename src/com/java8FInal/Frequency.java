package com.java8FInal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Frequency {

    public static void main(String[] args) {
        String s = "meeghana";
        LinkedHashMap<String, Long> collect = Arrays.stream(s.split("")).map(String::toUpperCase).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        String string = collect.entrySet().stream().filter(x -> x.getValue() > 1).map(x -> x.getKey()).findFirst().get();
        System.out.println(string);


    }
}
