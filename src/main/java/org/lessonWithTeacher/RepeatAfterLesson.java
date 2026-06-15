package org.lessonWithTeacher;

import java.util.Arrays;

public class RepeatAfterLesson {
    public static void main(String[] args) {

        int[] array1 = new int[] {1,0,3,4,0};
        allElementsInArray(array1);
        System.out.println("----------------------");
        System.out.println(sumOffElements(array1));
        System.out.println("----------------------");
        System.out.println(maxElementInArray(array1));
        System.out.println("----------------------");
        System.out.println(minElementOffArray(array1));
        System.out.println("----------------------");
        System.out.println(countEvenNumbers(array1));
        System.out.println("----------------------");
        System.out.println(Arrays.toString(newArray(array1)));
        System.out.println("----------------------");
        System.out.println(Arrays.toString(reverseNewArray(array1)));
        System.out.println("----------------------");
        System.out.println(Arrays.toString(reverse(array1)));
        System.out.println("----------------------");
        System.out.println(Arrays.toString(newArrayWithoutZero(array1)));
    }

    // вывести все элементы массива
    public static void allElementsInArray(int[] array1) {

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
    // сумму всех элементов
    public static int sumOffElements(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    // найти максимальный элемент массива
    public static int maxElementInArray(int[] array) {

        int max = 0;
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    // найти минимальный элемент массива
    public static int minElementOffArray(int[] array) {

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    // высчитать количество четных чисел
    public static int countEvenNumbers(int[] array) {

        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    // записать все элементы в новый массив умножив на два
    public static int[] newArray(int[] array) {

        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] * 2;
        }

        return newArray;
    }

    // перевернуть массив и вернуть новый
    public static int[] reverseNewArray(int[] array) {
        int[] reverse = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length - 1 - i];
        }

        return reverse;
    }

    // перевернуть массив другой вариант
    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length];

        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            reverse[j] = array[i];
            j++;
        }
        return reverse;
    }

    //вернуть массив без нулей
    public static int[] newArrayWithoutZero(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                count++;
            }
        }

        int[] newArray = new int[count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }
}
