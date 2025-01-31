package commonly.asked;

import java.util.stream.IntStream;

public class SumEven {

    public static void main(String[] args) {
        int asInt = IntStream.range(0, 10).filter(x -> x % 2 == 0).reduce((a, b) -> a + b).getAsInt();
        System.out.println(asInt);
    }
}
