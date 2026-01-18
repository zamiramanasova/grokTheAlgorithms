package org.lessonWithTeacher.leetCode.binarySearch;

import java.util.Arrays;

public class Repeat34 {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,7,7,8};
        int target = 7;
        System.out.println(Arrays.toString(findFirstAndLast2(array, target)));
    }
    public static int[] findFirstAndLast2(int[] array, int target) {
        int first = -1;
        int last = -1;
        first = findFirst1(array, target);
        last = findLast2(array, target);

        return new int[] {first, last};
    }
    public static int findFirst1(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int first = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                first = mid; //запоминаем сохранить mid как возможный ответ
                right = mid - 1; //ищем левее
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return first;
    }

    public static int findLast2(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return last;
    }
}
