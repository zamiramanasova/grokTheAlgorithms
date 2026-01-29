package org.lessonWithTeacher.leetCode.twoPointers;

import java.util.Arrays;

/**
 * При задании массива . Мы определяем бегущую сумму массива как .
 * numsrunningSum[i] = sum(nums[0]…nums[i])
 *
 * Вернём текущую сумму .nums
 * Пример 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */

public class PrefixSum1480 {
    public static void main(String[] args) {
       int[] array = new int[] {1,2,3,4};
       System.out.println(Arrays.toString(runningSum(array)));
    }

    public static int[] runningSum(int[] nums) {
       int number = 0;
       int[] newNums = new int[nums.length];
       for (int i = 0; i < nums.length; i++) {
          number = nums[i] + number;
          newNums[i] = number;
       }

       return newNums;
        //Time: O(n)
        //Space: O(n)
    }
}
