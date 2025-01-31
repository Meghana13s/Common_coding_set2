package com.infy;

public class Kpmg {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "pqr";
        // output : apbqcr
        StringBuilder s3 = new StringBuilder();

        for( int i=0; i < s1.length() ;i++) {
            s3.append(s1.charAt(i));
            if(i<s2.length()) {
                s3.append(s2.charAt(i));
            }
        }
        System.out.println(s3);

    }
}
