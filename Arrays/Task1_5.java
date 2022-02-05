package Arrays;

/*
Задача 5. Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] включительно таким образом,
          чтобы отрицательных и положительных элементов там было поровну и не было нулей. При этом порядок следования
          элементов должен быть случаен (т. е. не подходит вариант, когда в массиве постоянно выпадает сначала 6
          положительных, а потом 6 отрицательных чисел или же когда элементы постоянно чередуются через один и пр.).
          Вывести полученный массив на экран.
 */

import java.util.Arrays;
import java.util.Random;

public class Task1_5 {
    public static void main (String[] args) {
        Random rand = new Random ( );
        int[] array = new int[12];
        int plusNumber = 0;
        int minusNumber = 0;
        do {
            for (int i = 0; i < array.length; i++) {

                array[i] = rand.nextInt ( (10 - (-10)) + 1 ) + (-10);
                if (array[i] < 0) {
                    minusNumber++;
                }
                if (array[i] > 0) {
                    plusNumber++;
                }
                if (array[i] == 0) {
                    --i;
                }
                // При каждой итэрации проверяем условие равенства количества элементов и сбрасываем счетчики.
                // Без данного условия, программа может выполниться, а может уйти в бесконечный цикл.
                if (i == array.length - 1 & plusNumber != array.length / 2) {
                    plusNumber = 0;
                    minusNumber = 0;
                }
            }
        } while (minusNumber != array.length / 2 & plusNumber != array.length / 2);

        System.out.println ( "Массив из 12 случайных целых чисел из отрезка от -10 до 10: " + Arrays.toString ( array ) );
    }
}
