package com.java8;

import java.util.Arrays;
import java.util.List;

public class SortLengthString {

    public static void main(String[] args) {
        List<String> li =Arrays.asList("money","meghuuu","king","princess","queen","usa");
        li.stream().sorted().forEach(System.out::println);
    }
}
