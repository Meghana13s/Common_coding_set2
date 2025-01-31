package com.wf.coding;

import java.util.*;

public class nextGreaterElement1 {

    public static int[] nextGreaterElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
//        List<Integer> li = new ArrayList<>();
        int[] li = new int[arr.length];
        for(int i = arr.length-1; i >=0;i--) {
            while (!st.isEmpty() && arr[i] >= st.peek()) {
                st.pop();
            }
            if(st.isEmpty()) {
//                li.add(-1);
                li[i] = -1;
            } else {
//                li.add(st.peek());
                li[i] = st.peek();
            }
            st.push(arr[i]);
        }
//        Collections.reverse(li);

        return li;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] ints = nextGreaterElement(arr);
        System.out.println(Arrays.toString(ints));

    }
}
