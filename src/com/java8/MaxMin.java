package com.java8;

import java.util.Arrays;
import java.util.List;

public class MaxMin {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5);
//        List<Integer> l= null;
        Integer i = li.stream().reduce(Integer::max).get();
        Integer j = li.stream().reduce(Integer::min).get();

//        Integer l2 = l.stream().max(Integer::compareTo).orElseGet(null);
//        System.out.println(l2);
        System.out.println(i);
        System.out.println(j);
    }
}
