package Arrays;

/*
Задача 4. Есть массив int [] arr = {1, 76, 6, 43, 56, 2, 0, 18, 100, -7, 12, 90, 67, -32, 15}.
          Замените значение каждого элемента с нечётным индексом на ноль. Выведете массив на экран строкой,
          отделяя элементы между собой пробелом.
 */

public class Task4 {
    public static void main (String[] args) {

        int[] arr = {1 ,76 ,6 ,43 ,56 ,2 ,0 ,18 ,100 ,-7 ,12 ,90 ,67 ,-32 ,15};

        System.out.print ( "Массив элементов: " );
        for (int i = 0; i < arr.length; i++) {
            if (!(i % 2 == 0)) {
                arr[i] = 0;
            }
        }
        for (int j : arr) {
            System.out.print ( j + " " );
        }

    }
}
