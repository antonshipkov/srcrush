package Arrays;

/*
Задача 1. Заполнените массив целыми случайными числами из диапазона от 0 до 300 включительно.
          Выведите на экран среднего арифметического элементов массива.
 */

import java.util.Arrays;
import java.util.Random;

public class Task1_1 {
    public static void main (String[] args) {
        int size = 15;
        int sum = 0;
        int[] array = new Random ( ).ints ( size ,0 ,301 ).toArray ( );
        for (int j : array) {
            sum += j;
        }
        System.out.println ( "Массив из 15 случайных целых чисел из отрезка от 0 до 300: " + Arrays.toString ( array ) );
        System.out.println ( "Cреднее арифметическое элементов массива: " + sum / size );
    }
}
