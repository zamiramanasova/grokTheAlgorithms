package org.java;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLesson {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите число: ");
            list.add(scanner.nextInt());
        }
        scanner.close();
    }
}
