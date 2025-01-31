package com.java8;

import java.util.Arrays;
import java.util.List;

public class CommonTwoArrays {

    public static void main(String[] args) {
        List<Integer> li1 = Arrays.asList(12,44,21,1,2,7);
        List<Integer> li2 = Arrays.asList(12,22,56,78,1);
        li1.stream().filter(li2::contains).forEach(System.out::println);
    }
}
