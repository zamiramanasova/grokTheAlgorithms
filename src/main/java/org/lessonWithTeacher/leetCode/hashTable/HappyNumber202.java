package org.lessonWithTeacher.leetCode.hashTable;

import java.util.HashSet;
import java.util.Set;
public class HappyNumber202 {
    public static void main(String[] args) {
        int number = 18;
        System.out.println(happyNumber(number));
    }
    public static boolean happyNumber(int num) {
        Set<Integer> set = new HashSet<>();

        while (num != 1) {
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
            num = getNext(num);
        }
        return true;
    }

    //Его задача:
    //взять число
    //разбить его на цифры
    //каждую цифру возвести в квадрат
    //и сложить
    public static int getNext(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number = number / 10;
        }
        return sum;
        //Что делает getNext
        //getNext(19) → 82
        //getNext(82) → 68
        //getNext(68) → 100
        //getNext(100) → 1
        //
        //Это просто переходы.
    }
}
