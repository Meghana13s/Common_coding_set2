package com.wf.coding.pratice2;

import java.util.HashMap;

public class LongestSubString {
    public static void main(String[] args) {
        String longestSubstring = "takeUforward";

        int right = 0; int left = 0; int n = longestSubstring.length() ; int maxlenght = 0;
        HashMap<Character,Integer> hm = new HashMap<>();
        while (right < n) {
            if(hm.containsKey(longestSubstring.charAt(right))) {
                left = Math.max(left,hm.get(longestSubstring.charAt(right))+1);
            }
            hm.put(longestSubstring.charAt(right),right);
            maxlenght = Math.max(maxlenght,right-left+1);
            right++;
        }
        System.out.println(maxlenght);
    }
}
