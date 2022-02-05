package Arrays;

/*
Задача 2. Создайте массив из 25 элементов и заполните его случайными числами от 1 до 25 включительно.
          Пусть пользователь введет случайное число из указанного выше диапозона. Найдите в массиве первый элемент,
          который равен введенному пользователем числу. Выведите на экран индекс найденного элемента, или,
          если элемент не найден, соответствующее сообщение.
 */


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Task1_2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner ( System.in );
        int[] array = new Random ( ).ints ( 25 ,1 ,26 ).toArray ( );
        System.out.println ( Arrays.toString ( array ) );
        System.out.println ( "Введите целое число" );
        if (scanner.hasNextInt ( )) {
            int num = scanner.nextInt ( );
            for (int i = 0; i < array.length; i++) {
                if (array[i] == num) {
                    System.out.println ( "Индекс первого найденного числа с введенным числом с консоли: " + i );
                    break;
                } else {
                    System.out.println ( "Введенное число не равно " + (i + 1) + " элементу массива чисел" );
                }
            }

        } else {
            System.out.println ( "Введено не целое число" );
        }
    }
}
