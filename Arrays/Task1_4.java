package Arrays;

/*
Задача 4. Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
          Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
          Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
 */

import java.util.Random;

public class Task1_4 {
    public static void main (String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int[] array = new Random ( ).ints ( 11 ,-1 ,2 ).toArray ( );
        for (int j : array) {
            System.out.print ( j + " " );
            if (j == -1) {
                num1++;
            } else if (j == 0) {
                num2++;
            } else if (j == 1) {
                num3++;
            }
        }
        if (num1 != num2 || num1 != num3 || num2 != num3) {
            if (num1 > num2 && num1 > num3) {
                System.out.println ( "Число -1 встречается чаще других чисел, его частота: " + num1 + " раз" );
            } else if (num2 > num1 && num2 > num3) {
                System.out.println ( "Число 0 встречается чаще других чисел, его частота: " + num2 + " раз" );
            } else if (num3 > num1 && num3 > num2) {
                System.out.println ( "Число 1 встречается чаще других чисел, его частота: " + num3 + " раз" );
            }
        }
    }
}
