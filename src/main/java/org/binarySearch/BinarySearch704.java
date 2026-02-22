package org.binarySearch;

/**
 * Имея массив целых чисел, отсортированный по возрастающему порядку, и целое число ,
 * запишите функцию для поиска в . Если существует, то верните его индекс.
 * В противном случае возвращайте.-1
 * Вы должны написать алгоритм с сложной задачей во время выполнения.O(log n)
 * Пример 1:
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * Пример 2:
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 */
public class BinarySearch704 {
    public static void main(String[] args) {
        int[] array = {-1,0,3,5,9,12};
        System.out.println(search(array, 9));
    }

    public static int search(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2; //вычисление ИНДЕКСА, не элемента.
            int guess = array[middle];//записываем полученный элемент по полученному индексу

            if (guess == target) {
                return middle;
            }

            if (guess > target) {
                high = middle - 1;
            }

            if (guess < target) {
                low = middle + 1;
            }
        }

        return -1;
    }
}

//Time Complexity O(log n)
//Space Complexity O(1)
//Почему память O(1)?
//Потому что в коде бинарного поиска ты используешь:
//3 целых числа: low, high, mid
//одну переменную guess
//всё!
//Количество памяти не зависит от размера массива, значит — константа.
//Здесь нет:
//новых массивов рекурсии
//дополнительных структур данных
//👉 Память всегда одна и та же, хоть в массиве 10 элементов, хоть 10 миллионов
