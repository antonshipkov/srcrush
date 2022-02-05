package Arrays;

/*
Задача 6. Создайте массив из 15 случайных целых чисел из отрезка от -50 до 50. Определите какой элемент является
          в этом массиве максимальным. Для генерации случайных чисел использовать Math.random(). Выведите сам массив
          и его максимальный элемент на консоль
 */

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main (String[] args) {
        Random rand = new Random ( );
        int[] array = new int[15];
        System.out.print ( "Массив из 15 случайных целых чисел из отрезка от -50 до 50: " );
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt ( (50 - (-50)) + 1 ) + (-50);
            System.out.print ( array[i] + " " );
        }
        Arrays.sort ( array );
        System.out.println ( );
        System.out.println ( "Максимальный элемент массива: " + array[array.length - 1] );
    }
}
