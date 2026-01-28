package org.lessonWithTeacher.leetCode.hashTable;

import java.util.Hashtable;

public class ValidAnagramRepeat242 {
    public static void main(String[] args) {

        String s = "read";
        String b = "read";
        System.out.println(validAnagram(s,b));
    }
    public static boolean validAnagram(String s, String b) {

        if (s.length() != b.length()) {
            return false;
        }

        Hashtable<Character, Integer> map = new Hashtable<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            map.put(c,map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < b.length(); i++) {
            char c1 = b.charAt(i);

            if (!map.containsKey(c1)) {
                return false;
            }
            map.put(c1, map.get(c1) - 1);

            if (map.get(c1) < 0) {
                return false;
            }
        }
        return true;
    }
    //Time:  O(n)
    //Space: O(n)
    //последовательные циклы → складываются → O(n)
    //вложенные циклы → умножаются → O(n²)
 }
