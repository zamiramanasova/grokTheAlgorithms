package org.sorting;

/**
 * Задача делает поиск минимального элемента и выводит его индекс
 */
public class SortingMinimalElements {
    public static void main(String[] args) {
        int[] array = new int[] {4,1,3};
        System.out.println(sortingMinimalElements(array));
    }

    public static int sortingMinimalElements(int[] nums) {
        int smallest = nums[0];
        int smallest_index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
                smallest_index = i;
            }
        }
        return smallest_index;
    }
}
