package org.binarySearch;

/**
 * Для неотрицательного целого числа вернём квадратный корень из округлённого
 * вниз до ближайшего целого числа. Возвращаемое целое число также должно быть неотрицательным.xx
 * Нельзя использовать встроенную функцию или оператор экспоненты.
 * Например, не используйте их в C++ или Python.pow(x, 0.5)x ** 0.5
 *
 * Пример 1:
 *
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2, so we return 2.
 */
public class Sqrt69 {
    public static void main(String[] args) {
        int number = 11;
        System.out.println(mySqrt(number));
    }
    public static int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int left = 1;
        int right = x / 2;
        int answer = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x/mid) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }
}
