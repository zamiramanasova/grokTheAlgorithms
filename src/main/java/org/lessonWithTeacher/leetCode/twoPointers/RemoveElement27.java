package org.lessonWithTeacher.leetCode.twoPointers;

import java.util.Arrays;

public class RemoveElement27 {
    public static void main(String[] args) {

        int[] array = new int[] {1,2,3,4};
        int value = 3;
        System.out.println(removeElement(array, value));
    }

    public static int removeElement(int[] array, int value) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != value) {
                array[count] = array[i];
                count++;
            }
        }

        return count;
    }

    //Time O(n)
    //Space O(1)
}
