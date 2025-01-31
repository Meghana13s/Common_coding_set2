package commonly.asked;

import java.util.*;
import java.util.stream.Collectors;

public class AnagramsGrouping {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "tac", "act", "dog", "god", "odg", "evil", "vile", "live");
        Map<String, List<String>> collect = words.stream().collect(Collectors.groupingBy(word ->
        {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            return new String(charArray);
        }));
        collect.forEach((key,value) -> System.out.println(key+"  " +value));
    }

    }

