package Loops;

/*
Задача 3. Вывести на консоль последовательность чисел:
          7 14 21 28 35 42 49 56 63 70 77 84 91 98. Использовать циклы.
 */

public class Task3 {
    public static void main (String[] args) {
        System.out.print ( "Последовательность чисел: " );
        int num = 7;
        while (num < 100) {
            System.out.print ( num + " " );
            num += 7;

        }
    }
}
