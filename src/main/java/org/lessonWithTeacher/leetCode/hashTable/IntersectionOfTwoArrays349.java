package org.lessonWithTeacher.leetCode.hashTable;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays349 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3};
        int[] nums1 = new int[] {11,22,3};
        System.out.println(intersectionOfTwoArrays(nums, nums1));
    }

    public static Set<Integer> intersectionOfTwoArrays(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            int a = nums1[i];
            set1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }
        return result;
    }
}
