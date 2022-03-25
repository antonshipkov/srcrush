package Collections.Task3;

/*
   Задача 3
   Есть строка со следующим содержимым "Java, modern object-oriented computer programming language.
     Java was created at Sun Microsystems, Inc., where James Gosling led a team of researchers in an effort to create a
     new language that would allow consumer electronic devices to communicate with each other."
   Подсчитать количество вхождений каждого символа в стоку(т.e. сколько раз встречается каждый символ в данной строке).
   Главное усвловие использовать Map<Key, Value>. Key - символ, Value - количество вхождений.
 */


import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {
    private static final String string = "Java, modern object-oriented computer programming language. " +
            "Java was created at Sun Microsystems, Inc., where James Gosling led a team of researchers in an effort to " +
            "create a new language that would allow consumer electronic devices to communicate with each other.";

    private static final Map<Character, Integer> charsCount = new LinkedHashMap<> ( );

    public static void main (String[] args) {
        Chars ( );

    }
    public static void Chars ( ) {
        long time = System.nanoTime();
        for (int i = 0; i < string.length ( ); i++) {
            char ch = string.charAt ( i );
            charsCount.merge ( ch ,1 ,Integer::sum );


        }
        System.out.println ( "Колличество символов с строке: " + charsCount );
        time = System.nanoTime() - time;
        System.out.printf("Elapsed %,9.3f ms\n", time/1_000_000.0);

    }
}
