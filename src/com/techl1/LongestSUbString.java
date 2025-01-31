package com.techl1;

public class LongestSUbString {
    public static void main(String[] args) {
        String longestSubstring = "takeUforward";
        int maxleng = 0;

        for(int i=0; i < longestSubstring.length(); i++) {
            int[] arr = new int[256];
            for (int j=i; j < longestSubstring.length() ;j++) {
                if(arr[longestSubstring.charAt(j)] == 1) {
                    break;
                }
                maxleng = Math.max(maxleng,j-i+1);
                arr[longestSubstring.charAt(j)] = 1;
            }

        }

        System.out.println(maxleng);
    }

}
