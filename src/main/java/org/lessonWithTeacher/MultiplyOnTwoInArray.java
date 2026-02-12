package org.lessonWithTeacher;

import java.util.Arrays;

public class MultiplyOnTwoInArray {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,0};
        System.out.println(Arrays.toString(multiplyOnTwo(array)));
    }
    public static int[] multiplyOnTwo(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] * 2;
        }
        return newArray;
    }
}
