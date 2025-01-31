package com.pratiJava8;

public class StringManipulation {

    public static void main(String[] args) {
        // input : abc , pqr
        // output : apbqcr

        String input1 = "abc";
        String input2 = "pqr";

        StringBuilder output = new StringBuilder();
        for(int i=0;i<input1.length();i++) {
            output.append(input1.charAt(i));
                if(i < input2.length()) {
                    output.append(input2.charAt(i));
                }

        }
        System.out.println(output);
    }
}
