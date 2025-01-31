package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

    public static void main(String[] args) {
        String s = "SOrry";
        String s2 = "rrYos";

         s = s.replaceAll("\\s+", "").toLowerCase();
         s2 = s2.replaceAll("\\s+","").toLowerCase();
        char[] charArray1 = s.toCharArray();
        char[] charArray2  =s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        System.out.println(Arrays.equals(charArray1,charArray2));





        if(s.length() != s2.length()) {
            System.out.println("false");
        }

        List<String> collect1 = Arrays.stream(s.split("")).map(String::toUpperCase).sorted().collect(Collectors.toList());
        List<String> collect2 = Arrays.stream(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.toList());
        boolean b = collect2.equals(collect1);
        System.out.println(b);

    }
}
