package org.java;

import java.util.Scanner;

public class SimpleTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();

        System.out.println(first);
        if (second.length() < first.length()) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

        String s1 = first.substring(0,1).toUpperCase() + first.substring(1);
        String s2 = second.substring(0,1).toUpperCase() + second.substring(1);
        System.out.println(s1 + " " + s2);
    }
}
