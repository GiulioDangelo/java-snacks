package org.experis.snack1;

import java.util.Scanner;
public class EvenNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci un numero pari tra 10 e 20");
        int num = scan.nextInt();

        while (num % 2 != 0 || num < 10 || num > 20){
            System.out.println("numero errato, inserisci un numero pari tra 10 e 20");
            num = scan.nextInt();
        }

        System.out.println("numero corretto");
    }
}
