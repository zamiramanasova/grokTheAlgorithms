package org.lessonWithTeacher.leetCode.hashTable;

import java.util.HashMap;

public class MajorityElements169 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,2,3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int b = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
             int a = nums[i];
             hashMap.put(a, hashMap.getOrDefault(a,0) + 1);
             if (nums[i] > n/2) {
                 b = nums[i];
                 return b;
             }
        }
        return b;
    }
}
