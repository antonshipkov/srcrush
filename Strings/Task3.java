package Strings;

/*
      Задача 3. Напишите методы, который будет искать в строке слово с минимальным количеством различных символов.
      Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них.
      Например, в строке "ab джава abcd java 1234 JavaRush aaa 1212 one1" найденное слово должно быть "aaa".
 */


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    private static final String string = "ab джава abcd java 1234 JavaRush aaa 1212 one1";
    private static final ArrayList<String> list = new ArrayList<> ( );

    public static void main (String[] args) {

        Words ( );
    }

    public static void Words ( ) {

        Pattern pattern = Pattern.compile ( "\\w+" ,Pattern.UNICODE_CHARACTER_CLASS );
        Matcher matcher = pattern.matcher ( string );
        while (matcher.find ( )) {
            list.add ( matcher.group ( ) );
        }
        System.out.println ( "Слова в строке: " + list );

        list.sort ( Comparator.comparingInt ( Task3::difLetters ) );
        System.out.println ( "Минимальное количество различных символов в слове: " + list.get ( 0 ) );
    }

    public static int difLetters (String word) {
        Set<Character> chars = new HashSet<> ( );
        for (char c : word.toCharArray ( )) {
            chars.add ( c );
        }
        return chars.size ( );
    }
}




