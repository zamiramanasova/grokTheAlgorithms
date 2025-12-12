package org.java;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] a = new int[number];

        for (int i = 0; i < number; i++) {
            a[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
