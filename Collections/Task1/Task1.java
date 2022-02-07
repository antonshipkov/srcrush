package Collections.Task1;

/*
   Задача 1
   Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5, 5, 6, 5, 7, 8, 9, 9".
   Избавиться от повторяющихся элементов в строке.
   Вывести результат на консоль.
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class Task1 {
    private static final Set<Character> unique = new LinkedHashSet<> ( );
    private static final String string = "1, 2, 3, 4, 4, 5, 5, 6, 5, 7, 8, 9, 9";

    public static void main (String[] args) {

        System.out.println ( "Пероначальный список: " + string );
        Chars ();
    }

    public static void Chars ( ) {

        for (char c : string.toCharArray ( )) {
            unique.add ( c );
        }
        System.out.print ("Список без повторяющихся элементов: ");
        for (char dis : unique) {
            System.out.print ( dis + " " );
        }
    }
}
