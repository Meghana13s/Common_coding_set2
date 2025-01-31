package com.wf.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramsGrouping1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "tac", "act", "dog", "god", "odg", "evil", "vile", "live");
        Map<String, List<String>> collect = words.stream().collect(Collectors.groupingBy(word -> {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            return new String(charArray);
        }));
        collect.forEach((key,value)->System.out.println(value));


    }
}
