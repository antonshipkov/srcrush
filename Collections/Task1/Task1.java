package Collections.Task1;

/*
   Задача 1
   Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5, 5, 6, 5, 7, 8, 9, 9".
   Избавиться от повторяющихся элементов в строке.
   Вывести результат на консоль.
 */

import java.util.ArrayList;
import java.util.HashSet;

public class Task1 {
    private static final ArrayList<Integer> arrayList = new ArrayList<> ( );

    public static void main (String[] args) {

        arrayList.add ( 1 );
        arrayList.add ( 2 );
        arrayList.add ( 3 );
        arrayList.add ( 4 );
        arrayList.add ( 4 );
        arrayList.add ( 5 );
        arrayList.add ( 5 );
        arrayList.add ( 6 );
        arrayList.add ( 5 );
        arrayList.add ( 7 );
        arrayList.add ( 8 );
        arrayList.add ( 9 );
        arrayList.add ( 9 );
        System.out.println ( "Первоначальный список: " + arrayList );
        HashSet<Integer> myHashSet = new HashSet<> ( arrayList );
        System.out.println ( "Список без повторений: " + myHashSet );

    }
}
