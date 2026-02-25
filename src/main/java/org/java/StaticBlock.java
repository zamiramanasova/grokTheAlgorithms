package org.java;

import java.util.Scanner;

public class StaticBlock {
    static int H, B;
    static boolean flag = true;
    static {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        B = sc.nextInt();

        if (H <= 0 || B <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {

        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
