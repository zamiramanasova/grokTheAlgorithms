package org.lessonWithTeacher.leetCode.hashTable;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber202 {
    public static void main(String[] args) {

    }

    public static boolean happyNumber(int num) {
        Set<Integer> set = new HashSet<>();

        while (num != 1) {
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
            num = getNext(num);
        }
        return true;
    }

    public static int getNext(int number) {
        while (number > 1) {

        }
    }
}
