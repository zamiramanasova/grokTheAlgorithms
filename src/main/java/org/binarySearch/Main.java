package org.binarySearch;
//https://dev.to/faangmaster/podborka-zadach-na-leetcode-dlia-podghotovki-k-alghoritmichieskomu-sobiesiedovaniiu-4n51?ysclid=midj8q2yyt323794737
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11};
        System.out.println(binarySearch(numbers, 7)); // Ожидаем: 3
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0; // индекс начала массива (левый край)
        int high = arr.length - 1; // индекс конца массива (правый край)

        while (low <= high) { // ищем пока границы не пересеклись
            int mid = (low + high) / 2; // вычисляем индекс середины
            int guess = arr[mid]; // берем элемент по индексу середины

            if (guess == target) { // если нашли искомое число
                return mid; // возвращаем его индекс
            }

            if (guess > target) { // если середина больше цели
                high = mid - 1; // смещаем правую границу влево
            } else {
                low = mid + 1; // иначе смещаем левую границу вправо
            }
        }

        return -1; // если элемент не найден
    }
}