package org.java;

import java.util.Scanner;

public class StringSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(getSmallestAndLargest(s,k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        largest = s.substring(0, k);
        smallest = s.substring(s.length() -k);

        return smallest + "\n" + largest;
    }
}
