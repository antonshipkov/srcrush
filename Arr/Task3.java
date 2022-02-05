package Arr;

/*
Задача 3. Создать многомерный массив размерностью n на m. n и m ввести с клавиатуры.
          Заполнить массив использую Math.random() случайными числами от 1 до 100.
          Вывести массив на консоль. Найти среднее арифметическое элементов массива и
          максимальный эллемент массива и вывести их на консоль.
 */


import java.util.Scanner;

public class Task3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Введите высоту двумерного массива" );
        if (scanner.hasNextInt ( )) {
            int n = scanner.nextInt ( );
            if (n > 1) {
                System.out.println ( "Введите ширину двумерного массива" );
                if (scanner.hasNextInt ( )) {
                    int m = scanner.nextInt ( );
                    if (m > 1) {
                        int[][] array = new int[n][m];
                        int size = n * m;
                        int max = Integer.MIN_VALUE;
                        int sum = 0;
                        for (int i = 0; i < array.length; i++) {
                            for (int j = 0; j < array[i].length; j++) {
                                array[i][j] = (int) (Math.random ( ) * 100) + 1;
                                System.out.print ( array[i][j] + " " );
                                sum += array[i][j];
                                if(max < array[i][j]){
                                    max = array[i][j];
                                }
                            }
                            System.out.println ( "" );
                        }
                        System.out.println ( "Cреднее арифметическое элементов массива: " +
                                String.format ( "%.2f" ,(double) sum / size ) );
                        System.out.println ( "Максимальный элемент массива: " + max );

                    } else {
                        System.out.println ( "Ввели ширину массива меньше 2 " );
                    }
                } else {
                    System.out.println ( "Ввели не целое число" );
                }
            } else {
                System.out.println ( "Ввели высоту массива меньше 2 " );
            }
        } else {
            System.out.println ( "Ввели не целое число" );
        }
    }
}


