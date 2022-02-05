package Arr;

/*
Задача 2. Создать квадратный массив целых чисел размерностью n на n. n ввести с клавиатуры.
          Заполнить его любыми целыми числами. Вывести массив на консоль.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner ( System.in );

        System.out.println ( "Введите размер двумерного массива" );
        if (scanner.hasNextInt ( )) {
            int n = scanner.nextInt ( );
            if (n > 1) {
                int[][] array = new int[n][n];
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                            System.out.println ( "Введите целое число элемента массива" );
                            if (scanner.hasNextInt ( )) {
                                array[i][j] = scanner.nextInt ( );
                            } else {
                                System.out.println ( "Ввели не целое число" );
                                scanner.next();
                                --j;
                            }
                    }
                }
                System.out.println ( "Массив чисел с консоли размером " + n + " на " + n + Arrays.deepToString ( array ) );
            } else {
                System.out.println ( "Ввели размер массива меньше 2 на 2" );
            }
        } else {
            System.out.println ( "Ввели не целое число" );
            scanner.close ();
        }
    }
}
