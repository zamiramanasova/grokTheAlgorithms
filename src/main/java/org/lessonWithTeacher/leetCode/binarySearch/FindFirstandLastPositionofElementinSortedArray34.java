package org.lessonWithTeacher.leetCode.binarySearch;

import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray34 {
    public static void main(String[] args) {
        int[] array = new int[] {0,1,1,4,5};
        int target = 1;
        System.out.println(Arrays.toString(findFirstAndLast(array, target)));
    }

    public static int[] findFirstAndLast(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                left = mid;
                right = mid - 1;
            }
            if (array[mid] == target) {
                right = mid;
                left = mid + 1;

            }
            return new int[] {right, left};
        }
        return new int[] {-1,-1};
    }
}
