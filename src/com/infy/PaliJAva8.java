package com.infy;

public class PaliJAva8 {

    public static boolean chech(String s) {
        s = s.replaceAll("\\s+"," ");
        String s1 = new StringBuilder(s).reverse().toString();
        boolean equals = s.equals(s1);
        return equals;

    }

    public static void main(String[] args) {
        String s = "abviba";
        System.out.println(chech(s));
    }
}
