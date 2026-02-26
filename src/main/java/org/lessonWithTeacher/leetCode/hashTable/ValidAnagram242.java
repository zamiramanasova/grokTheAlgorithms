package org.lessonWithTeacher.leetCode.hashTable;

import java.util.Hashtable;

public class ValidAnagram242 {
    public static void main(String[] args) {
        String s = "read";
        String b = "read";
        System.out.println(anagram(s, b));
    }
    public static boolean anagram(String s, String b) {
        if (s.length() != b.length()) {
            return false;
        }

        Hashtable<Character, Integer> hashtable = new Hashtable<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            //«если ключ есть — верни его значение,
            //если ключа нет — верни defaultValue».
            hashtable.put(c, hashtable.getOrDefault(c, 0) + 1);
            //«возьми текущее количество буквы
            //если её ещё нет — считай, что было 0
            //и увеличь на 1»
        }

        for (int i = 0; i < b.length(); i++) {
            char c1 = b.charAt(i);

            if (!hashtable.containsKey(c1)) {
                return false;
            }
            //«уменьшить количество этой буквы на 1».
            hashtable.put(c1, hashtable.get(c1) - 1);

            if (hashtable.get(c1) < 0) {
                return false;
            }
        }
        return true;
    }
    //Time:  O(n)
    //Space: O(n)
    //последовательные циклы → складываются → O(n)
    //вложенные циклы → умножаются → O(n²)
}
