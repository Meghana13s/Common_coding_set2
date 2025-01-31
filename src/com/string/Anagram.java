package com.string;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {

//    public static boolean checkAna(String s1, String s2) {
//
//    }

    public static void main(String[] args) {
        String s1 = "meghak";
        String s2 = "eaghm";

        List<Character> collect1 = s1.toUpperCase().chars().mapToObj(c -> (char) c).sorted().collect(Collectors.toList());
        List<Character> collect2 = s2.toUpperCase().chars().mapToObj(c->(char)c).sorted().collect(Collectors.toList());



        boolean equals = collect1.equals(collect2);
        System.out.println(equals);


    }
}
