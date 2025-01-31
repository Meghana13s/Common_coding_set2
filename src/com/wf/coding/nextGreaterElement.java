package com.wf.coding;

import java.util.ArrayList;
import java.util.List;

public class nextGreaterElement {

    public static List<Integer> nextGreaterElement(int[] arr, int n) {
        List<Integer> li = new ArrayList<>();
        for(int i = 0; i< n;i++) {
            boolean foundGreater = false;
            for(int j =i+1 ; j< n;j++) {

                if(arr[i] < arr[j]) {
                    li.add(arr[j]);
                    foundGreater = true;
                    break;
                }
            }
            if(!foundGreater) {
                li.add(-1);
            }
        }
        return li;
    }
    public static void main(String[] args) {
        int[] arr = {7, 12, 1, 20};
        List<Integer> integers = nextGreaterElement(arr, arr.length);
        System.out.println(integers);

    }
}
