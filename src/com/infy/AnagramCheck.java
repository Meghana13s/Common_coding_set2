package com.infy;



import java.util.*;


    public class AnagramCheck {
        public static void main(String[] args) {
            String s1 = "listen";
            String s2 = "silent";

            if (areAnagrams(s1, s2)) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }

        public static boolean areAnagrams(String s1, String s2) {
            // If the lengths are different, they cannot be anagrams
            if (s1.length() != s2.length()) {
                return false;
            }

            // Create a frequency map for both strings
            Map<Character, Integer> frequencyMap1 = new HashMap<>();
            Map<Character, Integer> frequencyMap2 = new HashMap<>();

            // Fill the frequency maps for both strings
            for (int i = 0; i < s1.length(); i++) {
                frequencyMap1.put(s1.charAt(i), frequencyMap1.getOrDefault(s1.charAt(i), 0) + 1);
                frequencyMap2.put(s2.charAt(i), frequencyMap2.getOrDefault(s2.charAt(i), 0) + 1);
            }

            // Compare the frequency maps
            return frequencyMap1.equals(frequencyMap2);
        }
    }


