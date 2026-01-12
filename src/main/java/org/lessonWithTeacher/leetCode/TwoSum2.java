package org.lessonWithTeacher.leetCode;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] array = new int[] {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(array, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int num = 0;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
              return numbers;
            } else if(numbers[left] + numbers[right] < target){
                left++;
            } else {
                right--;
            }
        }
        return numbers;
    }
}
