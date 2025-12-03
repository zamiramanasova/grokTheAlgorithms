package org.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Задача делает поиск минимального элемента и выводит его индекс
 */
public class SortingMinimalElements {
    public static void main(String[] args) {
        int[] array = new int[] {4,1,3};
        System.out.println(selectSort(array));
    }

    //Метод поиска индекса минимального
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

    //Вспомогательная функция удаления элемента
    public static int[] removeElement(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        int newIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                newArray[newIndex] = array[i];
                newIndex++;
            }
        }
        return newArray;
    }

    //Метод сортировки выбором
    public static List<Integer> selectSort(int[] array) {
        List<Integer> newArray = new ArrayList<>();

        // создфем копию, чтобы не портить исходный массив
        int[] temp = array.clone();

        while (temp.length > 0) {
            int smallestIndex = sortingMinimalElements(temp);

            //добавляем элемент. а не индекс
            newArray.add(temp[smallestIndex]);

            temp = removeElement(temp, smallestIndex);
        }
        return newArray;
    }
}
