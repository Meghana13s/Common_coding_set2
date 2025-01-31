package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagrams {

    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "carrace";

        List<String> collect1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.toList());
        List<String> collect2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println(collect2);

        String collect = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        System.out.println(collect);
        System.out.println(s1);

        if(collect1.equals(collect2)) {
            System.out.println("two strings are anagrams");
        } else {
            System.out.println("no they are not");
        }
    }
}
