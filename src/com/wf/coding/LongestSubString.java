package com.wf.coding;

import java.util.HashMap;

public class LongestSubString {

    public static void main(String[] args) {
        String longestSubstring = "abaced";         // hm = a,0 ; b,1 ; a,

        int left = 0; int right = 0; int n= longestSubstring.length(); int length = 0;
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        while (right < n) {
            if(hm.containsKey(longestSubstring.charAt(right))) {
                left = Math.max( hm.get(longestSubstring.charAt(right))+1,left);
            }
            hm.put(longestSubstring.charAt(right),right);
            length = Math.max(right-left+1,length);
            right++;
        }
        System.out.println(length);
    }
}
