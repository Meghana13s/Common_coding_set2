package ms.subtex;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumberUnsorted {

    public static int findMissing(int n, List<Integer> numbers) {
//        int missing = 0;
        int actualSum = 0;
        int expectedSum = n*(n+1) /2;
        for(int j : numbers) {
            actualSum += j;
        }
        int missing = expectedSum - actualSum;
        return missing;

    }
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        int n =100;
        for(int i =1;i <=n ;i++) {
            if(i != 67) {
                al.add(i);
            }
        }
        System.out.println(findMissing(n,al));

    }
}
