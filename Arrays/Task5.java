package Arrays;

/*
Задача 5. Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
          Не используйте дополнительный массив для хранения результатов. Выведите конечный (поменяный) массив в консоль.
 */

public class Task5 {
    public static void main (String[] args) {

        String[] array = {"Я " ," люблю " ," Java "};
        for (String s : array) {
            System.out.print ( s );
        }
        System.out.println ( );

        String temp;

        for (int i = 0; i < array.length / 2; i++) {
            temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }

        for (String s : array) {
            System.out.print ( s );
        }
    }
}
