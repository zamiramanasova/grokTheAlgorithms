package org.lessonWithTeacher.leetCode.twoPointers;

import java.util.Arrays;

public class TwoSum167 {
    public static void main(String[] args) {
        int[] array = new int[] {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(array, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (numbers[left] + numbers[right] != target) {
            if(numbers[left] + numbers[right] < target){
                left++;
            } else {
                right--;
            }
        }
        return new int[]{ left + 1, right + 1 };
    }

    // Time:  O(n)
    // Space: O(1)
    // Algorithm: Two Pointers (left / right)
}

// В задаче 167:
// индексы: 1, 2, 3, 4, ...
// То есть:
// элемент numbers[0] → индекс 1
//элемент numbers[1] → индекс 2
//Поэтому:
//left + 1
//right + 1

