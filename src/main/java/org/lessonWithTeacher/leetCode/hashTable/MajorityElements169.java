package org.lessonWithTeacher.leetCode.hashTable;

import java.util.HashMap;

public class MajorityElements169 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,0,3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
             int a = nums[i];
             hashMap.put(a, hashMap.getOrDefault(a,0) + 1);
             if (hashMap.get(a) > n/2) {
                 return a;
             }
        }

        return -1;
    }
}
