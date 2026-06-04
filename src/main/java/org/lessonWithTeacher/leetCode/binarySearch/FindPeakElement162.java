package org.lessonWithTeacher.leetCode.binarySearch;
public class FindPeakElement162 {
    public static void main(String[] args) {
         int[] nums = new  int[] {1,5,1,1,1};
        System.out.println(peakElement(nums));
    }
    public static int peakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) { // чтобы не выйти за пределы массива, убираем <= и делаем <
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else { // иначе если nums[mid] > nums[mid + 1]
                right = mid;
            }
        }

        return left;
    }
    // Time:  O(log n)
    // Space: O(1)
}
