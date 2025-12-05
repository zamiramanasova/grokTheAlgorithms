package org.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeSoredArray88 {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[] {2,5,6};
        int n = 3;

        //System.out.println(merge(nums1, m, nums2, n)));
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] array = new int[]{nums1.length - m};
        int[] array2 = new int[]{nums2.length};

        int[] ans  = mergeArraysUsingStreams(array, array2);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans));
        }
    }

    public static int[] mergeArraysUsingStreams(int[] arr1, int[] arr2) {

        // Using Java Stream
        return IntStream.concat(Arrays.stream(arr1),
                Arrays.stream(arr2)).toArray();
    }
}
