package com.pratiJava8;

import java.util.Arrays;
import java.util.List;

public class StartsWith5 {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(12,55,34,56,51);
        li.stream().map(x->x.toString()).filter(x->x.startsWith("1")).forEach(System.out::println);
    }
}
