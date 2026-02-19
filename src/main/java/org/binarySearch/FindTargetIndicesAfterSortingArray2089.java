package org.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Вам даётся целый массив с индексом 0 и целевой элемент .numstarget
 * Целевой индекс — это индекс такого, что .inums[i] == target
 *
 * Возвращайте список целевых индексов после сортировки в
 * неубывающем порядке. Если целевых индексов нет, возвращайте
 * пустой список. Вернутый список должен сортироваться в порядке возрастания.numsnums
 *
 * Пример 1:
 *
 * Input: nums = [1,2,5,2,3], target = 2
 * Output: [1,2]
 * Explanation: After sorting, nums is [1,2,2,3,5].
 * The indices where nums[i] == 2 are 1 and 2.
 */
public class FindTargetIndicesAfterSortingArray2089 {
    public static void main(String[] args) {
         int[] array = new int[] {1,2,5,2,3};
        System.out.println(targetIndices(array, 7));
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        //дается массив
        //отсортировать массив
        //вывести индексы расположения таргета
        Arrays.sort(nums);
        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                array.add(i);
            }
        }

        return array;
    }
}
