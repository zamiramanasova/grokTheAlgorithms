package org.lessonWithTeacher;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4};
        System.out.println(maxElement(array));
    }

    public static int maxElement(int[] nums) {
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
