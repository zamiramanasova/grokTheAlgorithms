package org.simpleTasks;

/**
 * Имея строку, состоящую из слов и пробелов,
 * возвращаем длину последнего слова в строке.s

 * Слово — это максимум подстрока состоящий
 * только из символов, не размещающихся в пробелах.
 *
 * Пример 1:
 *
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5
 */
public class LengthOfTheLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int end = s.length() - 1;

        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end - start;
   }
}
