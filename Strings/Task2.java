package Strings;

/*
   Задача 2. У вас есть строка "One two three один два три one1 two2 three3 1 2 3 123". Найти количество слов,
             содержащих только символы латинского алфавита.
 */


import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    private static final String string = "One two three один два три one1 two2 three3 1 2 3 123";
    private static final String regex = ("\\b[a-zA-Z]+\\b");
    private static final ArrayList<String> list = new ArrayList<> ( );

    public static void main (String[] args) {

        LatinWords ( );

    }

    public static void LatinWords ( ) {

        Pattern latinPattern = Pattern.compile ( regex );
        Matcher matcher = latinPattern.matcher ( string );
        while (matcher.find ( )) {
            list.add ( matcher.group ( ) );
        }
        System.out.println ( "Колличество слов содержащие только символы латинского алфавита:  " + list.size ( ) );
        System.out.println ( "Слова: " + list );
    }

}


