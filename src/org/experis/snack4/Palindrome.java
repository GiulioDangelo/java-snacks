package org.experis.snack4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci una stringa:");
        String string = scan.nextLine();

        boolean flag = true;

        int left = 0;
        int right = string.length() - 1;

        while (left < right) {
            if (string.charAt(left) != string.charAt(right)) {
                flag = false;
                break;
            }
            left++;
            right--;
        }

        if (flag) {
            System.out.println("La stringa è palindroma.");
        } else {
            System.out.println("La stringa non è palindroma.");
        }
    }
}

