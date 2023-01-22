package com.example;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();

        if (Math.abs(x) > Math.abs(y)) {
            System.out.print("Ответ: " + x / 2);
        } else {
            System.out.println("Ошибка: Второе число больше первого");
        }

    }

}
