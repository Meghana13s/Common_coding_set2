package com.wf.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOrOdd {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Map<String, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(x -> x % 2 == 0 ? "even" : "odd"));
        List<Integer> even = collect.get("even");
        List<Integer> odd = collect.get("odd");

        System.out.println(even);
        System.out.println(odd);

    }
}
