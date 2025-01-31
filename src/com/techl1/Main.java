package com.techl1;

import java.util.*;
public class Main {
    static int solve(String s) {
        int r = 0;
        int l =0;
        int maxLength = 0;
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        while (r < s.length()) {
            if(hm.containsKey(s.charAt(r))) {
                l = Math.max(hm.get(s.charAt(r)) + 1,l);
            }
            hm.put(s.charAt(r),r);
            maxLength = Math.max(maxLength,r-l+1);
            r++;
        }
        return maxLength;
    }

    public static void main(String args[]) {
        String str = "takeUforward";
        System.out.println("The length of the longest substring without repeating characters is " + solve(str));

    }
}