package org.arrays;

import java.util.Arrays;

/**
 * Given two strings and , return if is an st true tanagram of ,
 * and otherwise.s false
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true

 * Example 2:
 *
 * Input: s = "rat", t = "car"
 *
 * Output: false
 */
public class ValidAnagram242 {
    public static void main(String[] args) {
         String array1 = "anagram";
         String array2 = "ganaram";
        System.out.println(anagram(array2, array1));
    }

    public static boolean anagram(String s, String t) {
         if (s.length() != t.length()) {
             return false;
         }
         char[] s1 = s.toCharArray();
         char[] t1 = t.toCharArray();

         Arrays.sort(s1);
         Arrays.sort(t1);

        return Arrays.equals(s1, t1);
    }

}
