package ms.subtex;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "ana";
        String s2 = "aan";

        String collect1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String collect2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        if(collect1.equals(collect2)) {
            System.out.println("it's anagram");
        } else {
            System.out.println("noooo");
        }


    }
}
