package org.lessonWithTeacher.leetCode.binarySearch;

import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray34 {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,7,7,8};
        int target = 7;
        System.out.println(Arrays.toString(findFirstAndLast(array, target)));
    }

    public static int[] findFirstAndLast(int[] array, int target) {
        int first = -1;
        int last = -1;

         first = findFirst(array, target);
         last = findLast(array, target);

        return new int[]{first, last};
    }

    private static int findFirst(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int first = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    private static int findLast(int[] array, int target) {
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

    // Time O(log n)
    // Space O(1)
    // количество переменных постоянно
    // независимо от того:
    // массив из 10 элементов
    // или из 10 миллионов
}
