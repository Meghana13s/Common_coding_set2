package com.pratiJava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MAxMin {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer i = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(i);


    }
}
