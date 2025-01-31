package com.java8;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,2,3,4,5,5);
        li.stream().distinct().forEach(System.out::println);
    }
}
