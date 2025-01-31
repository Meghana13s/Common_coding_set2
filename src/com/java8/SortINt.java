package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortINt {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,6,8,33,45,22,12);
        // difference between sort and sorted
        // where sort modifies original list , sort must be directly applied on list of int not on streams of integer
        // sorted doesn't
        li.sort(Integer::compareTo);
        System.out.println("fffff   "+li);
        List<Integer> collect = li.stream().sorted(Integer::compareTo).collect(Collectors.toList());
        li.stream().sorted(Comparator.naturalOrder());
        System.out.println(collect);


        // Integer :: compareTo -> ascending
        // Comparator.reverseOrder() -> descending order
        // Comparator.naturalOrder() -> ascending order
        // (a,b) -> b.compareTo(a) -> descending order
        // (a,b) -> a.compareTo(b) -> ascending order
    }
}
