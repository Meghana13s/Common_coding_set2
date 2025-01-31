package com.wf.coding;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCharacter {

    public static void main(String[] args) {
        String s = "meghanag me";

        List<String> collect = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet()
                .stream().filter(x -> x.getValue() > 1).map(x -> x.getKey()).collect(Collectors.toList());

        System.out.println(collect);

        List<Map.Entry<String, Long>> collect1 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(x -> x.getValue() > 1).collect(Collectors.toList());
        System.out.println(collect1);

//        List<Map.Entry<String, Long>> collect2 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(x -> x.getValue() > 1).skip(1).collect(Collectors.toList());
//        System.out.println(collect2);


    }
}
