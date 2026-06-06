package org.lessonWithTeacher.leetCode.binarySearch;

public class Sqrt69 {
    public static void main(String[] args) {
        int number = 16;
        System.out.println(sqrt69(number));

    }
    public static int sqrt69(int number) {
        int left = 0;
        int right = number;
        int answer = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid; // во избежание переполнения
            if (square == number) {
                return mid;
            } else if (square < number) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }

    // Time: O(log n)
    //Space: O(1)
}
