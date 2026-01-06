package org.lessonWithTeacher;

public class FindSecondMax {
    public static void main(String[] args) {

        int[] array1 = new int[] {1,2,5,4,7};
        System.out.println(secondMax(array1));
    }

    public static int secondMax(int[] array) {

        int maxIndex = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxIndex) {
                secondMax = maxIndex;
                maxIndex = array[i];
            } else if (array[i] > secondMax && array[i] != maxIndex) {
                secondMax = array[i];
            }

        }
        return secondMax;
    }
}
