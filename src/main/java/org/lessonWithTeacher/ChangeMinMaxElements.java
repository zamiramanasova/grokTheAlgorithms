package org.lessonWithTeacher;

import java.util.Arrays;

public class ChangeMinMaxElements {
    public static void main(String[] args) {
        int[] array1 = new int[] {1,2,0,4,7};
        System.out.println(Arrays.toString(swapMinAndMaxElements(array1)));
    }

    public static int[] swapMinAndMaxElements(int[] array) {
        int min = array[0];
        int max = 0;

        for(int i = 0;i < array.length; i++) {
            if (array[i] < min)
                min = i;
            if (array[i] > max)
                max = i;
        }

        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];

        }

        for (int i = 0; i < newArray.length; i++) {
            int number = min;
            if (i == min)
                newArray[min] = newArray[max];
            if (i == max)
                newArray[max] = newArray[number];


        }

        return newArray;
    }
}
