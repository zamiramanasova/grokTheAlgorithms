package org.lessonWithTeacher.leetCode;

public class RemoveElement27 {
    public static void main(String[] args) {

    }

    public static int[] removeElement(int[] array, int value) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != value) {
                array[count] = array[i];
                count++;
            }
        }

        return array;
    }
}
