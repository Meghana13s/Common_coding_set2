package com.pratiJava8;

import java.util.Arrays;
import java.util.List;

public class CheckDuplicates {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,4,6);
        int[] li1 = {1,2,3,4,5};

        long count = li.stream().distinct().count();
        System.out.println(count);
        if(count != li.size()) {
            System.out.println("duplicate exist");
        }

    }
}
