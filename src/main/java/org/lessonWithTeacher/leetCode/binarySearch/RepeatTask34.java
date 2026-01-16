package org.lessonWithTeacher.leetCode.binarySearch;

public class RepeatTask34 {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,4,5};
        int target = 4;
    }

    public static int[] searchElements(int[] array, int target) {
        int first = searchFirst(array, target);
        int last = searchLast(array, target);


    }

    public static int searchFirst(int[] array, int target) {
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

    public static int searchLast(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        int last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                last = mid;
                right = mid - 1;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return last;
    }
}
