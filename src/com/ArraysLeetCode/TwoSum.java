package com.ArraysLeetCode;

import java.util.HashMap;

public class TwoSum {

    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int complementary = target - nums[i];
            if(hm.containsKey(complementary)) {
                return new int[] {hm.get(complementary),i};
            }
            hm.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 12, 11,7 , 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        // Print the result (indices of the two numbers)
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
