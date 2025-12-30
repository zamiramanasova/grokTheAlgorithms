package org.lessonWithTeacher;

public class CountEvenInArray {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,0};
        System.out.println(countEven(array));
    }

    public static int countEven(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
