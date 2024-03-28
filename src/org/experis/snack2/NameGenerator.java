package org.experis.snack2;

import java.util.Arrays;
import java.util.Random;
public class NameGenerator {
    public static void main(String[] args) {
        String[] names = { "Mario", "Luigi", "Giovanna", "Antonio", "Francesca", "Roberto", "Laura", "Alessandro", "Giulia", "Stefano"};
        String[] lastnames = {"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari", "Esposito", "Romano", "Gallo", "Conti", "Costa"};

        String[] randomFullNames = new String[10];

        for (int i = 0; i < 10; i++) {
            Random randomGenerator = new Random();
            int randomName = randomGenerator.nextInt(names.length);
            int randomLastname = randomGenerator.nextInt(lastnames.length);
            String randomFullName = names[randomName] + " " + lastnames[randomLastname];

            randomFullNames[i] = randomFullName;
        }

        System.out.println(Arrays.toString(randomFullNames));
    }
}
