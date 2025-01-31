package com.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reverse {

    public static void main(String[] args) {
        String s = "java";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);

        String s1 = "java is good";
        StringBuilder sb1 = new StringBuilder(s1);
        sb1.reverse();
        System.out.println(sb1);

        String collect = Stream.of(s1.split(" ")).map(x -> new StringBuilder(x).reverse()).collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
