package org.lessonWithTeacher.leetCode;

import java.util.Arrays;

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
        //
        //Space: O(n)
    }
}
