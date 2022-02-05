package Arrays;

/*
Задача 3. Имеется массив из четырёх чисел int[] numbers = {4, 99, 18, 15, 1};. Поменяйте местами первый и
          второй элемент массива.
 */

import java.util.Arrays;

public class Task3 {
    public static void main (String[] args) {

        int[] numbers = {4 ,99 ,18 ,15 ,1};
        int temp1 = numbers[0];
        int temp2 = numbers[1];
        numbers[1] = temp1;
        numbers[0] = temp2;

        System.out.println ( Arrays.toString ( numbers ) );
    }
}
