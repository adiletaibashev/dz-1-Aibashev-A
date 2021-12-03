package com.company;

public class Main {

    public static void main(String[] args) {
        String big_ben;
        final int NUM = 21;
        String word = "color";
        big_ben = NUM + word;
        System.out.print(big_ben + " " + NUM + " " + word);


        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else System.out.println("Вы сохранили нуль");
    }
}
