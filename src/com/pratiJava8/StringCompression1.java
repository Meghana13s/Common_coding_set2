package com.pratiJava8;

public class StringCompression1 {

    public static void main(String[] args) {
        String input = "w3a1s4";
        StringBuilder ouput = new StringBuilder();
        for(int i=0;i<input.length();i++) {
            char currentChar = input.charAt(i);
            if(i+1 < input.length() && Character.isDigit(input.charAt(i+1))) {
                int count = Character.getNumericValue(input.charAt(i+1));
                ouput.append(String.valueOf(currentChar).repeat(count));
                i++;
            } else {
                ouput.append(currentChar);
            }
        }
        System.out.println(ouput);
    }
}
