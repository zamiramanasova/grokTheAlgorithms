package org.binarySearch;

import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray2089 {
    public static void main(String[] args) {

    }

    public List<Integer> targetIndices(int[] nums, int target) {
        //дается массив
        //отсортировать массив
        //вывести индексы расположения таргета
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;

        }
    }
}
