package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOrOdd {
    public static void main(String[] args) {
        List<Integer> listINt = Arrays.asList(11,12,32,4,5,6,3,8,9);
        Map<String, List<Integer>> collect = listINt.stream().collect(Collectors.groupingBy(num -> num % 2 == 0 ? "even" : "odd"));
        List<Integer> even = collect.get("even");
        List<Integer> odd = collect.get("odd");

        even.sort(Integer::compareTo);
        odd.sort(Integer::compareTo);

        System.out.println(even);
        System.out.println(odd);



    }
}
