package com.techl1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CombSort {

    public static void main(String[] args) {
        int[] arr1 = {1,4,7,8};
        int[] arr2 = {6,8,2,3};

        IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().forEach(System.out::println);
    }
}
