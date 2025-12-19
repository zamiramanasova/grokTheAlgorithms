package org.java;

public class StringSubstring {
    public static void main(String[] args) {

    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        smallest = s.substring(k);
        largest = s.substring(s.length() -k);
        System.out.println(smallest);
        System.out.println(largest);
        return smallest + "\n" + largest;
    }
}
