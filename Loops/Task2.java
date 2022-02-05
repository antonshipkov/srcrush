package Loops;

/*
Задача 2. Напишите программу, где пользователь вводит любое целое положительное число с клавиатуры.
          А программа суммирует все числа от 1 до введенного пользователем числа.
 */

import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Введите целое число больше 1" );
        int sum = 0;
        if (scanner.hasNextInt ( )) {
            int number = scanner.nextInt ( );
            if (number > 1) {
                for (int i = 1; i <= number; i++) {
                    sum += i;
                }
                System.out.println ( "Сумма чисел от 1 до введенного числа: " + sum );
            } else {
                System.out.println ( "Введено целое число меньше 2" );
            }
        } else {
            System.out.println ( "Введено не число" );
        }
    }
}
