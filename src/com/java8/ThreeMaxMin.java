package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeMaxMin {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(23,45,87,1,9,66,22,32,4,8,13,34);

        List<Integer> collect = li.stream().sorted().collect(Collectors.toList());
        collect.stream().limit(3);

        li.stream().sorted().limit(3).forEach(System.out::println);
        System.out.println("--------------------------------------------------------");
        li.stream().sorted((a,b)->b.compareTo(a)).limit(3).forEach(System.out::println);
    }
}
