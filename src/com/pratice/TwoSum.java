package com.pratice;

import java.util.HashMap;

public class TwoSum {

    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i < nums.length ; i++) {
            int com = target - nums[i];
            if(hm.containsKey(com)) {
                return new int[] {hm.get(com),i};
            }
            hm.put(nums[i],i);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 12, 11,7 , 15};
        int target = 23;
        int[] ints = twoSum(nums, target);
        System.out.println(ints[0]+" " +ints[1]);

    }
}
