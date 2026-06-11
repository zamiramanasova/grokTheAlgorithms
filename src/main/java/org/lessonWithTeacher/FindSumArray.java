package org.lessonWithTeacher;

public class FindSumArray {
    public static int sum(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4};
        System.out.println(sum(array));
    }
}

// Как работает:
// изначально sum = 0
// i=0 → sum = 0 + 1 = 1
//i=1 → sum = 1 + 2 = 3
//i=2 → sum = 3 + 3 = 6
//i=3 → sum = 6 + 4 = 10
//И получаем правильный результат — 10.
