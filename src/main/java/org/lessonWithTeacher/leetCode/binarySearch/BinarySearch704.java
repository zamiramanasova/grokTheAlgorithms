package org.lessonWithTeacher.leetCode.binarySearch;

public class BinarySearch704 {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5};
        int target = 4;
        System.out.println(search(array, target));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        //когда left == right, в диапазоне остаётся один элемент
        //его обязательно нужно проверить
        //
        //если использовать <, мы его пропустим
        while (left <= right) {
            //это индекс среднего элемента, не значение.
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        //«элемент не найден».
        return -1;
    }
    //Time: O(log n)
    //Space: O(1)
}
