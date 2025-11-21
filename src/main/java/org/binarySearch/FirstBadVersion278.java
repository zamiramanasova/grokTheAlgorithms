package org.binarySearch;

public class FirstBadVersion278 {
    public static void main(String[] args) {

    }
    public static int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        boolean bad = isBadVersion(middle);

        while (low < high) {
            int middle = (low + high) / 2; //вычисление ИНДЕКСА, не элемента.

            if (isBadVersion(middle) == true) {
                high = middle - 1;
            }

            if (isBadVersion(middle) == false) {
                low = middle + 1;
            }

        }
        return low;
    }
}
