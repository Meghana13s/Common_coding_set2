package com.ArraysLeetCode;

public class CheckSorted {

//    public static boolean checkSorted(int[] nums) {
//        for(int i=1;i<nums.length;i++) {
//            if(nums[i] >= nums[i-1]) {
//
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }

    public static boolean checkSorted(int[] nums) {
        for(int i=1;i<nums.length;i++) {
            if(nums[i] < nums[i-1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,5,9};
        System.out.println(checkSorted(nums));

    }
}
