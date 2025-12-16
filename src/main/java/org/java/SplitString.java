package org.java;

import java.util.Arrays;
import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = Arrays.toString(sc.nextLine().split(" "));
        for(String newWord : word.split(" ")){
            System.out.println(newWord);
        }

        sc.close();
    }
}
