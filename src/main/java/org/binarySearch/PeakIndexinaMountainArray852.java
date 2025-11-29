package org.binarySearch;

/**
 * Вам даётся целочисленный горный массив длины,
 * значения увеличиваются до пика, а затем уменьшаются.arrn
 *
 * Верните индекс пикового элемента.
 *
 * Ваша задача — решить её с ограниченными временами.O(log(n))
 *
 * Пример 1:
 *
 * Вход: arr = [0,1,0]
 *
 * Выпуск: 1
 *
 * Пример 2:
 *
 * Вход: arr = [0,2,1,0]
 *
 * Выпуск: 1
 */
public class PeakIndexinaMountainArray852 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,3,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] array) {
        int left = 0;// это обозначение индекса
        int right = array.length - 1; // обозначение индекса

        while (left <= right) {
            int middle = left + (right - left) / 2; //вычисление ИНДЕКСА, не элемента.

            if (array[middle] <= array[middle + 1]) { // если элемент middle меньше элемента middle+1, то
                left = middle + 1; // ищем справа
            } else {
                right = middle - 1; // ищем слева
            }
        }
        return left;
    }
}
