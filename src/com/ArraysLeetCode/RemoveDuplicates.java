package com.ArraysLeetCode;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Initialize unique count to 1 since the first element is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i]; // Shift non-duplicate element to the next available position
                uniqueCount++; // Increment unique count
            }
        }

        return uniqueCount;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
