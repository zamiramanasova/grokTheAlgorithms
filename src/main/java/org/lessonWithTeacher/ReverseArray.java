package org.lessonWithTeacher;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,0};
        System.out.println(Arrays.toString(reverseArray(array)));
    }

    public static int[] reverseArray(int[] array) {
        int[] reverseArray = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[i] = array.length - 1 - i;
        }
        return reverseArray;
    }
}
