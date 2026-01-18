package org.lessonWithTeacher.leetCode.binarySearch;

public class FirstBadVersion278 {
    public static void main(String[] args) {
        int number = 5;
        int version = 4;
        System.out.println(firstBadVersion(number));
        System.out.println(isBadVersion(version));
    }

    public static int firstBadVersion(int number) {
        int left = 0;
        int right = number;
        int badVersion = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                badVersion = mid;
                right = mid - 1;
            } else  {
                left = mid + 1;
            }
        }
        return badVersion;
    }

    public static boolean isBadVersion(int version) {
        return true;
    }
}
