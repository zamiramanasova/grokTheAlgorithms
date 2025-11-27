package org.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTargetIndicesAfterSortingArray2089 {
    public static void main(String[] args) {

    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        //дается массив
        //отсортировать массив
        //вывести индексы расположения таргета
        Arrays.sort(nums);

        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
                array.add(i);
        }

        for (Integer index : array) {
            if (index == target)
                return Collections.singletonList(index);
        }

        return
    }
}
