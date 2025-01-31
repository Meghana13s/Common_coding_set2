package com.wf.coding;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram2 {

    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";

        String collect1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String collect2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        System.out.println(collect1.equals(collect2) ? "true" : "false");



    }
}
