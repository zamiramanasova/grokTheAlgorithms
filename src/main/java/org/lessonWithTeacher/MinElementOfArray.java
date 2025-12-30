package org.lessonWithTeacher;

public class MinElementOfArray {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,0};
        System.out.println(minElementsOfArray(array));
    }

    public static int minElementsOfArray(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}
