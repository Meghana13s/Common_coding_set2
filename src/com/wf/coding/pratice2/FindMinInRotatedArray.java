package com.wf.coding.pratice2;

public class FindMinInRotatedArray {

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if mid is the smallest element
            if (nums[mid] > nums[right]) {
                // Minimum is in the right half
                left = mid + 1;
            } else {
                // Minimum is in the left half or mid itself
                right = mid;
            }
        }

        // After the loop ends, left will be pointing to the minimum element
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {6, 7, 9, 15, 19, 2, 3};
        System.out.println("Minimum element: " + findMin(nums));
    }
}

