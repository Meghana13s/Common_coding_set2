package com.java8;

import java.util.Arrays;
import java.util.List;

public class TotalNumberOfElementsListOfInt {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5);
        Integer reduce = li.stream().reduce(0, (a, b) -> a + b);  // reduce first arg is initial or default value i.e 1 here
        System.out.println(reduce);
    }
}
