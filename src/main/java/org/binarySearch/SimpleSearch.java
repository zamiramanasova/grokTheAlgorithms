package org.binarySearch;

public class SimpleSearch {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11};
        System.out.println(binarySearch(numbers, 7));
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];

            if (guess == target) {
                return mid;
            }

            if (guess > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
