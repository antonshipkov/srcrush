package Arrays;

/*
Задача 3. Дан массив с числами [5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4].
          Переместить все нули в конец массива.
 */

import java.util.Arrays;

public class Task1_3 {
    public static void main (String[] args) {
        int[] array = {5 ,4 ,3 ,0 ,6 ,0 ,0 ,5 ,6 ,0 ,25 ,0 ,8 ,7 ,3 ,0 ,1 ,1 ,0 ,6 ,4};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] == 0) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println ( Arrays.toString ( array ) );
    }
}
