package org.lessonWithTeacher.leetCode.binarySearch;

public class SearchInsertPosition35 {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5};
        int target = 6;
        System.out.println(searchInsert(array, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return target;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    //Time: O(log n)
    //Space: O(1)
}
