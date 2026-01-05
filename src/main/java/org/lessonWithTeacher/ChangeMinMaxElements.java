package org.lessonWithTeacher;

import java.util.Arrays;

public class ChangeMinMaxElements {
    public static void main(String[] args) {
        int[] array1 = new int[] {1,2,0,4,7};
        System.out.println(Arrays.toString(swapMinAndMaxElements(array1)));
    }

    public static int[] swapMinAndMaxElements(int[] array) {
        int minIndex = 0;
        int maxIndex = 0;

        for(int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex])
                minIndex = i;
            if (array[i] > array[maxIndex])
                maxIndex = i;
        }

        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];

        }

        int swap = newArray[minIndex];
        newArray[minIndex] = newArray[maxIndex];
        newArray[maxIndex] = swap;

        return newArray;
    }
}
