package org.lessonWithTeacher.leetCode;

import java.util.Arrays;

public class RemoveDuplicates26 {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,2,4};
        System.out.println(removeDuplicates(array));
    }

    public static int removeDuplicates(int[] array) {
        if (array.length == 0) return 0;

        int number = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[number - 1]) {
                array[number] = array[i];
                number++;
            }
        }

        return number;

        //Time O(n)
        //Space O(1)
    }
}
