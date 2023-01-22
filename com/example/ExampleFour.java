package com.example;

import java.util.Scanner;

public class ExampleFour {
    public static void main(String[] args) {
        // Задание 4
       Scanner scanner = new Scanner(System.in);
       int[] array = new int[10];
       int i;
       for (i = 0; i <array.length; i++) {
           System.out.println("Введите число " + (i + 1) + ":");
           array[i] = scanner.nextInt();
       }
        System.out.println("Результат: ");
       for (i = 0; i < array.length; i++) {
           System.out.print(array[i] + " ");
       }


    }
}
