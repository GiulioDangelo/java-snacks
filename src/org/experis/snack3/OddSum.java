package org.experis.snack3;

public class OddSum {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 1) {
                sum += num[i];
            }
        }

        System.out.println(sum);
    }
}