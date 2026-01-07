package org.lessonWithTeacher.leetCode;

import java.util.Arrays;

public class SquaresOfASortedArray977 {
    public static void main(String[] args) {
        int[] array = new int[] {-4,-1,1,3,6};
        System.out.println(Arrays.toString(sortedSquares(array)));
    }

    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int position = nums.length - 1;
        int[] result = new int[nums.length];

        while (left < right) {
            if (nums[right] * nums[right] > nums[left] * nums[left]) {
                nums[right] = nums[right] * nums[right];
                result[position] = nums[right];
                right--;
                position--;
            }
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                nums[left] = nums[left] * nums[left];
                result[position] = nums[left];
                left++;
                position--;
            }
            if (nums[right] * nums[right] == nums[left] * nums[left]) {
                nums[right] = nums[right] * nums[right];
                result[position] = nums[right];
                right--;
                position--;
            }
        }

        return result;

        //Time: O(n)
        //Space: O(1)
    }
}
