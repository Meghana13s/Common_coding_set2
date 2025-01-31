package ms.subex;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Test {

//    Print unique numbers and sort based on duplicate count -
//            1,2,3,4,4,3,2,1,1,5,6,1,3,6
//    Output - 1,3,2,4,6,5

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1,1,5,6,1,3,6};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i< nums.length ;i++) {
            hm.put(nums[i] , hm.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
                (a,b)-> b.getValue() - a.getValue()
        );
        pq.addAll(hm.entrySet());

        while (!pq.isEmpty()) {
            Map.Entry<Integer, Integer> poll = pq.poll();
            Integer key = poll.getKey();
            System.out.print(key+",");
        }

    }
}
