package org.sorting;

import java.util.Arrays;

/**
 * Имея массив целых чисел и целое число , возвращают индексы двух чисел так,
 *
 * что они складываются в целевую цель.numstarget
 *
 * Можно предположить, что каждый вход будет иметь ровно одно решение,
 *
 * и не использовать один и тот же элемент дважды.
 *
 * Вы можете вернуть ответ в любом порядке.
 *
 * Пример 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 *
 * Output: [0,1]
 */

public class TwoSum1 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3};
        int target = 3;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        throw new IllegalArgumentException("No solution found");
    }
}
