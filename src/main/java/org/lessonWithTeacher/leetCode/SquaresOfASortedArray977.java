package org.lessonWithTeacher.leetCode;

import java.util.Arrays;

public class SquaresOfASortedArray977 {
    public static void main(String[] args) {
        int[] array = new int[] {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(array)));
    }

    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                nums[left] = nums[left] * nums[left];
                result[right] = nums[left];
                left++;
            } else {
                nums[right] = nums[right] * nums[right];
                result[left] = nums[right];
                right--;
            }
        }

        return result;
    }
}
