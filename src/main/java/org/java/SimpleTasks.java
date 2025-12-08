package org.java;

import java.util.Scanner;

public class SimpleTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();

        int num1 = first.length();
        int num2 = second.length();
        System.out.println(num1 + num2);
        if (second.length() <= first.length()) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        String s1 = first.substring(0,1).toUpperCase() + first.substring(1);
        String s2 = second.substring(0,1).toUpperCase() + second.substring(1);
        System.out.println(s1 + " " + s2);
    }
}
