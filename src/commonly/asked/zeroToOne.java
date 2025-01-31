package commonly.asked;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class zeroToOne {

    public static void main(String[] args) {
        IntStream.range(1,11).forEach(System.out::println);  // method 1
        Stream.iterate(0,n->n+1).limit(11).forEach(System.out::println);  // method 2
        int i = 0;
        while ( i < 10) {
//            System.out.println(i);
            i++;
        }
    }
}
