package org.lessonWithTeacher.leetCode;

import java.util.Arrays;

public class MoveZeroes283 {
    public static void main(String[] args) {
        int[] array = new int[] {1,0,3,4};
        moveZeroes(array);
    }

    public static void moveZeroes(int[] nums) {
        int firstNumber = 0;
        int lastNumber = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                firstNumber = nums[lastNumber];
                nums[lastNumber] = nums[i];
                nums[i] = firstNumber;
                i++;

            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
