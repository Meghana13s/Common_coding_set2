package com.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsorted {

    public static void main(String[] args) {
        int[] a = new int[] {22,76,3,5};
        int[] b = new int[] {11,87,43,34};

        int[] array = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(array)); // prints the elements properly
        System.out.println(array.toString());  // prints memory address of the object
    }
}
