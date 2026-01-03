package org.lessonWithTeacher;

import java.util.Arrays;

public class NewArrayWithoutZero {
    public static void main(String[] args) {
        int[] array = new int[] {1,0,2,3,4,0};
        System.out.println(Arrays.toString(removeZeros(array)));
    }
    public static int[] removeZeros(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                count++;
            }
        }

        int[] newArray = new int[count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }
}
