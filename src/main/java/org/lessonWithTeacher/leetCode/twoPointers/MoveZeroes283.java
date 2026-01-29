package org.lessonWithTeacher.leetCode.twoPointers;

import java.util.Arrays;

/**
 Имея целочисленный массив , перемещаем все s в его конец,
 сохраняя относительный порядок ненулевых элементов.nums0

 Обратите внимание, что это нужно делать на месте, не копируя массивы.

 Пример 1:

 Input: nums = [0,1,0,3,12]
 Output: [1,3,12,0,0]
 */
public class MoveZeroes283 {
    public static void main(String[] args) {
        int[] array = new int[] {3,0,5,4,0,8};
        //moveZeroes(array);
        moveZeroes2(array);
    }
    //мое решение не совсем верное
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

    public static void moveZeroes2(int[] nums) {
        int j = 0; // указатель для ненулевых

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++; // отдельный счетчик для j, только если выполняется условие
            }
        }

        // заполняем оставшиеся позиции нулями
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
        System.out.println(Arrays.toString(nums));

        //Time: O(n)
        //
        //Space: O(1)
        //Алгоритм: Two Pointers (read / write)
    }
}
