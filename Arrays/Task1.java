package Arrays;

/*
Задача 1. Создать массив из десяти целых чисел и вывести его на консоль.
          Создать массив из 10 строковых значений и вывести его на консоль.
 */

public class Task1 {
    public static void main (String[] args) {
        intMethod ( );
        stringMethod ( );
    }

    public static void intMethod ( ) {
        int[] array = new int[10];
        System.out.print ( "Массив из 10 целых чисел: " );
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print ( array[i] + " " );
        }
        System.out.println ( );
    }

    public static void stringMethod ( ) {
        String[] array = new String[10];
        System.out.print ( "Массив из 10 строковых значений: " );
        for (int i = 0; i < array.length; i++) {
            array[i] = "Java,";
            System.out.print ( array[i] + " " );
        }
        System.out.println ( );

    }
}
