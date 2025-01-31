package com.infy;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        String s = "aSdf";
        String s2 = "fsdA";
        if(s.length() != s2.length()) {
            System.out.println("false");
        }

        s = s.replaceAll("\\s+","").toLowerCase();
        s2 = s2.replaceAll("\\s+","").toLowerCase();

        char[] charArray1 = s.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        boolean c = Arrays.equals(charArray1,charArray2);

        boolean b = charArray1.equals(charArray2);
        System.out.println(c);


    }
}
