package com.java8FInal;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";

        String collect1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String collect2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());


        if(collect1.equals(collect2)) {
            System.out.println("it's ana");
        } else {
            System.out.println("it's not....");
        }
    }
}
