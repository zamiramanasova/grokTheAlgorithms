package org.lessonWithTeacher;

public class RepeatAfterLesson {
    public static void main(String[] args) {
        int[] array1 = new int[] {1,2,3,4,5};
        allElementsInArray(array1);
        System.out.println("----------------------");
        System.out.println(sumOffElements(array1));
    }

    //вывести все элементы массива
    public static void allElementsInArray(int[] array1) {

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
    //сумму всех элементов
    public static int sumOffElements(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }
}
