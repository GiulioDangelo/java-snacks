package org.experis.bonus;

import java.util.Scanner;

public class Bonus1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        int countAlphabetic = 0;
        int countDigit = 0;
        int countNonAlphanumeric = 0;

        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);

            if (Character.isLetter(letter)){
                countAlphabetic++;
            } else if (Character.isDigit(letter)) {
                countDigit++;
            } else {
                countNonAlphanumeric++;
            }
        }

        System.out.println("Caratteri alfabetici: " + countAlphabetic);
        System.out.println("Numeri: " + countDigit);
        System.out.println("Simboli non alfanumerici: " + countNonAlphanumeric);
    }
}
