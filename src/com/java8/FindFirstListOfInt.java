package com.java8;

import java.util.Arrays;
import java.util.List;

public class FindFirstListOfInt {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(2,5,6,7,4,5);
        Integer i = li.stream().findFirst().get();
        System.out.println(i);
    }
}
