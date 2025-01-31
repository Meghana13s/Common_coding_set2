package commonly.asked;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lists {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("meghana", "sinchana", "meghana", "sonu", "momi");
        LinkedHashMap<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);

        list.stream().distinct().sorted().forEach(System.out::println);


    }
}
