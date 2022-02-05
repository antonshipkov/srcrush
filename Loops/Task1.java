package Loops;

/*
Задача 1. Вывести на экран числа от 1 до 15 в строку через пробел. Сделать это через for, while, do-while,
          т.е у вас должно быть три варианта решения этой задачи.
 */

public class Task1 {


    public static void main (String[] args) {
        forMethod ( );
        whileMethod ( );
        dowhileMethod ( );
    }

    public static void forMethod ( ) {

        System.out.print ( "forMethod: " );
        for (int i = 1; i <= 15; i++) {
            System.out.print ( i + " " );
        }
        System.out.println ( );
    }

    public static void whileMethod ( ) {
        int count = 1;
        System.out.print ( "whileMethod: " );
        while (count <= 15) {
            System.out.print ( count + " " );
            count++;
        }
        System.out.println ( );
    }

    public static void dowhileMethod ( ) {
        int count = 1;
        System.out.print ( "dowhileMethod: " );
        do {
            System.out.print ( count + " " );
            count++;
        }
        while (count <= 15);

        System.out.println ( );

    }
}
