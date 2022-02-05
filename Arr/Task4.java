package Arr;

/*
Задача 4. Ввести с клавиатуры элементы квадратного двумерного массива целых чисел размерностью 5 на 5.
          Елементы массива в диапозоне от 1 до 10. Проверьте, является  ли  двумерный  массив  симметричным
          относительно  главной диагонали. Главная диагональ — та, которая идёт из левого верхнего угла двумерного
          массива в правый нижний.
 */

import java.util.Scanner;

public class Task4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner ( System.in );
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println ( "Введите целое число элемента массива от 1 до 10" );
                if (scanner.hasNextInt ( )) {
                    int temp = scanner.nextInt ( );
                    if (temp >= 1 && temp <= 10) {
                        array[i][j] = temp;
                    } else {
                        System.out.println ( "Введено число не из диапозона от 1 до 10. Введите число." );
                        --j;
                    }
                } else {
                    System.out.println ( "Ввели не целое число" );
                    scanner.next ( );
                    --j;
                }
            }
        }
        scanner.close ( );
        // Делаем дополнительный цикл, для визуализации чисел в массиве(не обязательно)
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print ( anInt + "  " );
            }
            System.out.println ( );
        }
        if (symmetric ( array )) {
            System.out.println ( "Двумерный массив симметричен относительно главной диагонали!" );
        } else {
            System.out.println ( "Двумерный массив НЕ симметричен относительно главной диагонали!" );
        }
    }

    // метод для проверки симетрии относительно  главной диагонали
    static boolean symmetric (int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - i; j++) {
                if (array[i][j] != array[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
