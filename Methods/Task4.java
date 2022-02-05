package Methods;

/*
     Задача 4. Написать метод, который будет сортировать указанный вами массив по возрастанию
               любым известным вам способом. Обязательно использовать его в main.
 */

import java.util.Arrays;

public class Task4 {
    public static void main (String[] args) {
        int[] array1 = {45,1,24,6,17,-7,0,67,-56,20,17};
        int[] array2 = {22,1,24,0,17,-7,54,67,-52,16,17};
        System.out.println("Первоначальный массив чисел: " + Arrays.toString ( array1 ) );
        System.out.println("Отсортированный массив по возрастанию методом bubbleSort: " +
                Arrays.toString ( bubbleSort ( array1 ) ) );
        System.out.println();
        System.out.println("Первоначальный массив чисел: " + Arrays.toString ( array2 ) );
        System.out.println("Отсортированный массив по возрастанию методом arraysSort: " +
                Arrays.toString ( arraysSort ( array2 ) ) );
    }

    // Сортировка пузырьком
    public static int[] bubbleSort (int[] array1){
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1.length - 1; j++){
                if(array1[j] > array1[j + 1]){
                    int temp = array1[j + 1];
                    array1[j + 1] = array1[j];
                    array1[j] = temp;
                }
            }
        }
        return array1;
    }
    // Самый простой известный способ
    public static int[] arraysSort (int[] array2) {
        Arrays.sort(array2);
        return array2;
    }
}
