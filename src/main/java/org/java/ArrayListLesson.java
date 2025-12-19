package org.java;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLesson {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countArray = scanner.nextInt();
        for (int i = 0; i < countArray; i++) {
            int number = scanner.nextInt();
            ArrayList<Integer> list = new ArrayList<>(number);
            list.add(scanner.nextInt());
            System.out.println(list);
        }

        scanner.close();
    }
}

//5  устанавливаем количество создаваемых массивов
//        5 41 77 74 22 44 размер массива наполняем
//        1 12
//        4 37 34 36 52
//        0
//        3 20 22 33
//        5
//        1 3 хотим получить в 1 массиве 3 индекс
//        3 4
//        3 1
//        4 3
//        5 5
