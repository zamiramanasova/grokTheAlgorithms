package org.java;

import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // Удаляем знаки препинания
        input = input.replaceAll("[^a-zA-Z ]", "");

        // Разбиваем на слова
        String[] words = input.split("\\s+");

        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
}
