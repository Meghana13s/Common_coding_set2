package com.string;

public class RemoveDuplicate {

    public static void main(String[] args) {
        String s = "abcc";
        StringBuilder res = new StringBuilder();
        boolean[] seen = new boolean[256];
        for(int i=0;i<s.length();i++) {
            if(!seen[s.charAt(i)]) {
                seen[s.charAt(i)]=true;
                res.append(s.charAt(i));
            }
        }
        System.out.println(res);

    }
}
