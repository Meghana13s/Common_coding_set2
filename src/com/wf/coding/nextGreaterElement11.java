package com.wf.coding;

import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElement11 {

    public static int[] next(int[] arr) {
        int[] li = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length- 1; i>=0;i--) {
            while (!st.isEmpty() && arr[i] >= st.peek()) {
                st.pop();
            }
            if(st.isEmpty()) {
                li[i] = -1;
            } else {
                li[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return li;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        System.out.println(Arrays.toString(next(arr)));

    }
}
