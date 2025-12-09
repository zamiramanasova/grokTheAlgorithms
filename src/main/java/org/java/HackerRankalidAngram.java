package org.java;
import java.util.Arrays;

public class HackerRankalidAngram {
    public static void main(String[] args) {
        String a = "cat";
        String b = "act";

        System.out.println(anagram(a, b));

    }
    public static boolean anagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        String aa = a.toLowerCase();
        String bb = b.toLowerCase();
        char[] a1 = aa.toCharArray();
        char[] b1 = bb.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);

        return Arrays.equals(a1, b1);
    }
}
