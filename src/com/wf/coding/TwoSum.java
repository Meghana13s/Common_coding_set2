package com.wf.coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

    public static int[] chek(int[] arr , int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            int complementary = target - arr[i];
            if(hm.containsKey(complementary)) {
                return new int[] {hm.get(complementary),i};
            }
            hm.put(arr[i],i);
        }

        return arr;
    }
    public static void main(String[] args) {
        int arrr[] = {0,2,3,4,5};  // 1,3
        int targets = 6;
        int[] chek = chek(arrr, targets);
        System.out.println(Arrays.toString(chek));
    }
}
