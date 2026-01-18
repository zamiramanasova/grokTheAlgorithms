package org.lessonWithTeacher.leetCode.binarySearch;

public class FirstBadVersion278 {
    static int FIRST_BAD = 4;

    public static void main(String[] args) {

        int number = 5;
        int version = 3;
        System.out.println(firstBadVersion(number));
        System.out.println(isBadVersion(version));
    }

    public static boolean isBadVersion(int version) {
        return version >= FIRST_BAD;
    }
    public static int firstBadVersion(int number) {
        int left = 1;
        int right = number;
        int badVersion = -1;

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


}
