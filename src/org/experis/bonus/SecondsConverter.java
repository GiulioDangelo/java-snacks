package org.experis.bonus;

public class SecondsConverter {
    public static void main(String[] args) {
        int value = 3661;

        int hours = value / 3600;
        int minutes = (value % 3600) / 60;
        int seconds = value % 60;

        String timeFormatted = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        System.out.println(seconds + " secondi equivalgono a: " + timeFormatted);
    }

}
