package com.wf.coding;

public class StringCompression {

    public static void main(String[] args) {
        String input = "w3r4t1y2";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i< input.length() ;i++) {
            char currentChar = input.charAt(i);
            if( i+ 1 < input.length() && Character.isDigit(input.charAt(i+1))) {
                int count  = Character.getNumericValue(input.charAt(i+1));
                for(int j = 0;j < count ;j++) {
                    sb.append(currentChar);
                }
            }

        }
        System.out.println(sb);
    }
}
