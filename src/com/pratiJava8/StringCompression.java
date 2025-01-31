package com.pratiJava8;

public class StringCompression {

    public static void main(String[] args) {
        // input : w3r4t1y2
        // ouput : wwwrrrrtyy
        String input = "w3r4t1y2";
        StringBuilder outpt = new StringBuilder();
        for(int i=0;i<input.length();i++) {
            char cuurentChar = input.charAt(i);
            if(i+1 < input.length() && Character.isDigit(input.charAt(i+1))) {
                int count = Character.getNumericValue(input.charAt(i+1));
                for(int j=0;j<count;j++) {
                    outpt.append(cuurentChar);
                }
            }
        }
        System.out.println(outpt);
    }
}
