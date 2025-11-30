package org.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Задача делает поиск минимального элемента и выводит его индекс
 */
public class SortingMinimalElements {
    public static void main(String[] args) {
        int[] array = new int[] {4,1,3};
        System.out.println(Arrays.toString(selectSort(array)));
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

    public static List[] selectSort(int[] array) {
        //int[] newArray = new int[array.length];
        List<Integer> newArray = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int smallest = sortingMinimalElements(array);
            newArray.add(smallest);

        }
        return new List[]{newArray};
    }
}
