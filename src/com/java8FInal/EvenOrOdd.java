package com.java8FInal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOrOdd {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 44, 6, 2, 3, 77, 9, 11);
        List<Integer> integers = list.stream().collect(Collectors.groupingBy(x -> x % 2 == 0)).get(true);
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(x -> x % 2 == 0));
        collect.get(true);
        System.out.println(integers);

    }
}
