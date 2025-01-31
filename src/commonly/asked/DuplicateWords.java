package commonly.asked;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWords {

    public static void main(String[] args) {
        String s ="I am doing an interview at ey I work for ey";
        HashMap<String, Long> collect = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
//        System.out.println(collect);
        collect.entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey()).forEach(System.out::println);
    }
}
