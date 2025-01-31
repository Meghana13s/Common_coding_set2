package com.java8;

import java.util.Arrays;
import java.util.List;

public class StartsWith5 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(12,55,34,56,51);
        li.stream().map(a->a.toString()).filter(a->a.startsWith("5")).forEach(System.out::println);
    }
}
