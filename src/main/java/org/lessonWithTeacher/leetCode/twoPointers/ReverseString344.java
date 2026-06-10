package org.lessonWithTeacher.leetCode.twoPointers;

import java.util.Arrays;

public class ReverseString344 {
    public static void main(String[] args) {
        char[] s = new char[] {'h','e','l','l','o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char position;

        while (left < right) {
            position = s[left];
            s[left] = s[right];
            s[right] = position;

            right--;
            left++;
        }
        System.out.println(Arrays.toString(s));

        // Time: O(n)
        //Space: O(1) доп память постоянная, то есть не создаю новый
    }
}
