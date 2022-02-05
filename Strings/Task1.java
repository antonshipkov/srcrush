package Strings;

/*
   Задача1. У вас есть строка “I like JavaRush!!!”. Порабойте немного с ней.
            1. Выведите в консоль последний символ строки.
            2. Проверьте, содержит ли ваша строка подстроку “JavaRush”.
            3. Найдите позицию подстроки “like” в строке “I like JavaRush!!!”.
            4. Замените все символы “а” на “!”.
            5. Преобразуйте строку к верхнему регистру.
            6. Преобразуйте строку к нижнему регистру.
            7. Вырежьте строку JavaRush c помощью метода String.substring().
            8. Выведи строку на консль n раз. n задать с клавиатуры.
 */

import java.util.Scanner;

public class Task1 {

    private static final Scanner scanner = new Scanner ( System.in );
    private static final String string = "I Like JavaRush!!!";

    public static void main (String[] args) {

        System.out.println ( "Последний символ строки: " + string.substring ( string.length ( ) - 1 ) );

        if (equalWord ( "JavaRush" )) {
            System.out.println ( "Строка содержит JavaRush" );
        } else {
            System.out.println ( "Строка не содержит JavaRush" );
        }

        System.out.println ( "Позиция подстроки Like: " + string.indexOf ( "Like" ) );
        System.out.println ( "Заменяем символ 'a' на '!' :" + string.replace ( 'a' ,'!' ) );
        System.out.println ( "Преобразование к верхнему регистру: " + string.toUpperCase ( ) );
        System.out.println ( "Преобразование к нижнему регистру: " + string.toLowerCase ( ) );
        System.out.println ( "Обрезаем JavaRush: " + string.substring ( 0 ,7 ) );
        stringMethod ( );
    }

    public static boolean equalWord (String str) {
        return string.contains ( str );
    }

    public static void stringMethod ( ) {
        System.out.println ( "Введите количество выводов строки: " );
        if (scanner.hasNextInt ( )) {
            int n = scanner.nextInt ( );
            for (int i = 0; i < n; i++) {
                System.out.println ( string );
            }
        } else {
            System.out.println ( "Ввели не целое число" );
        }
    }
}
