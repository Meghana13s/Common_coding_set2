package com.wf.coding.pratice2;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterELement {
    public static int[] next(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] newarr = new int[arr.length];

        for (int i = arr.length-1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] >= st.peek()) {
                st.pop();
            }
            if (st.isEmpty()) {
                newarr[i] = -1;
            } else {
                newarr[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return newarr;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        System.out.println(Arrays.toString(next(arr)));

    }
}
