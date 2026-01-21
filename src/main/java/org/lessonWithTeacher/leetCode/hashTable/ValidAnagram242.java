package org.lessonWithTeacher.leetCode.hashTable;

import java.util.Hashtable;

public class ValidAnagram242 {
    public static void main(String[] args) {
        String s = "read";
        String b = "read";
        System.out.println(anagram(s, b));
    }
    public static boolean anagram(String s, String b) {
        if (s.length() != b.length()) {
            return false;
        }

        Hashtable<Character, Integer> hashtable = new Hashtable<>();

        for (int i = 0; i < )

    }
}
