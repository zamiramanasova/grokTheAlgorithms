package org.lessonWithTeacher;

public class RepeatAfterLesson {
    public static void main(String[] args) {
        allElementsInArray();
    }

    //вывести все элеметны массива
    public static void allElementsInArray() {
        int[] array1 = new int[] {1,2,3,4,5};
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }

}
