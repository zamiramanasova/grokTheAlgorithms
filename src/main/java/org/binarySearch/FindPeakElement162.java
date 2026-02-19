package org.binarySearch;

/**
 * Пиковый элемент — это элемент, который строго больше своих соседей.
 * Для целого массива с индексом 0 , найдите пиковый элемент и верните его индекс.
 * Если массив содержит несколько пиков, верните индекс любому из пиков.nums

 * Вы можете себе представить. Другими словами, элемент всегда считается строго
 * большим соседа, находящегося вне массива.nums[-1] = nums[n] = -∞
 *
 * Вы должны написать алгоритм, который работает во времени.O(log n)
 * Пример 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: 2
 * Explanation: 3 is a peak element and your function should return the index number 2.
 */
public class FindPeakElement162 {
    public static void main(String[] args) {
        int[] array = {1,2,3,1};
        int result = findPeakElement(array);
        System.out.println(result);
    }
    public static int findPeakElement(int[] nums) {
       int low = 0;
       int high = nums.length - 1;

       while(low < high) {
           int mid = (high + low) / 2;

           if (nums[mid] > nums[mid + 1]) {
               high = mid;
           } else {
               low = mid + 1;
           }
       }
       return low;
    }
}
