package org.sorting;

import java.util.Arrays;

public class RunningSumOf1dArray1480 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            // Возьми текущее число в nums[i]
            // прибавь к нему предыдущее значение nums[i - 1]
            //и результат положи обратно в nums[i].
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
