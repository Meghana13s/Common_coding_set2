package com.java8;

import javax.crypto.spec.PSource;
import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.List;

public class SquareFilterGReater50 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,45,56,58,76,3);
        li.stream().map(a->a*a).filter(a->a>50).forEach(System.out::println);
    }
}
