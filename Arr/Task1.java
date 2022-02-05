package Arr;

/*
Задача 1. Создать массив типа String размером 3 на 6.
          И записать в него значения:
          a1  a2  a3  a4  a5  a6
          b1  b2  b3  b4  b5  b6
          c1  c2   c3  c4  c5  c6
          Вывести массив на консоль.
 */

public class Task1 {

    public static void main (String[] args) {
        String[][] array = new String[3][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i] == array[0]) {
                    array[i][j] = "a";
                    System.out.print ( array[i][j] + (j + 1) + " " );
                } else if (array[i] == array[1]) {
                    array[i][j] = "b";
                    System.out.print ( array[i][j] + (j + 1) + " " );
                } else if (array[i] == array[2]) {
                    array[i][j] = "c";
                    System.out.print ( array[i][j] + (j + 1) + " " );
                }
            }
            System.out.println ( );
        }
    }
}
