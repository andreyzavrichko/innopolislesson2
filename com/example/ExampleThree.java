package com.example;

public class ExampleThree {
    public static void main(String[] args) {
        // Задание 3
        int x = 0;
        int y = 0;

        do {
            if ((x % 39 == 0) && (x > y) ) {
                y = x;
            }
            x++;
        } while (x <= 5000);
        System.out.println("Число, которое нацело делится на 39: " + y);
    }
}
