package org.binarySearch;

/**
 * Имея отсортированный массив из различных целых чисел и целевое значение,
 * вернём индекс, если цель найдена. Если нет, верните индекс там,
 * где он был бы, если бы его вставили в порядке.
 * Вы должны написать алгоритм с сложной задачей во время выполнения.O(log n)
 * Пример 1:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 */
public class SearchInsertPosition35 {
    public static void main(String[] args) {
        int[] array = {-1,0,3,5,9,12};
        System.out.println(searchInsert(array, 8));
    }
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2; //вычисление ИНДЕКСА, не элемента.
            int guess = nums[middle];//записываем полученный элемент по полученному индексу

            if (guess == target) {
                return middle;
            }

            if (guess > target) {
                high = middle - 1;
            }

            if (guess < target) {
                low = middle + 1;
            }
        }

        return low;
    }
}
//Time Complexity O(log n)
//Space Complexity O(1)
