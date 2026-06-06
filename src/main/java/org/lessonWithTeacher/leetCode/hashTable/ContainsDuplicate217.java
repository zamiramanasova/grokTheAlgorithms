package org.lessonWithTeacher.leetCode.hashTable;

import java.util.HashSet;
import java.util.Set;
public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int[] nums = new  int[] {1,5,4,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> setNums = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (setNums.contains(nums[i])) {
                return true;
            } else {
                setNums.add(nums[i]);
            }
        }
        return false;
    }

    //Time:  O(n)
    //Space: O(n)
}
