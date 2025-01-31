package com.java8;

import java.util.Arrays;
import java.util.List;

public class CheckDuplicates {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 1, 2, 2, 3);
        int[] nums = {1, 2, 2, 3};
        // li.stream()
        // Arrays.stream(nums);

        // nums.length()
        // li.size()
        if (Arrays.stream(nums).distinct().count() != nums.length) {
            System.out.println("duplicates ide");
        }

        if (li.stream().distinct().count() != li.size()) {
            System.out.println("duplicates ide");
        }
    }
}
