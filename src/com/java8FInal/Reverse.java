package com.java8FInal;

public class Reverse {

    public static void main(String[] args) {
        String s ="meg";
        StringBuilder sb = new StringBuilder();

        for(int i=s.length()-1;i>=0;i--) {
            sb.append(s.charAt(i));
        }

        System.out.println(sb);
    }
}
