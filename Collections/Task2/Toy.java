package Collections.Task2;

/*
   Задача 2
   Создать класс Игрушка (поля придумать произвольно).
   Создайте HashMap, содержащий пары значений  - имя игрушки и объект Игрушка.
   Перебрать и распечатать пары значений - entrySet().
   Перебрать и распечатать набор из имен продуктов  - keySet().
   Перебрать и распечатать значения продуктов - values().
   Для каждого перебора создать свой метод.
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Toy {
    private static final HashMap<String, String> map = new HashMap<> ( );

    public static void main (String[] args) {
        map.put ( "жираф" ,"высокий" );
        map.put ( "зайчик" ,"средний" );
        map.put ( "бегемот" ,"большой" );
        map.put ( "мишка" ,"маленький" );
        System.out.println ( entrySet ( ) );
        System.out.println ( keySet ( ) );
        System.out.println ( values ( ) );
    }

    public static Collection<Map.Entry<String, String>> entrySet ( ) {
        return map.entrySet ( );
    }

    public static Set<String> keySet ( ) {
        return map.keySet ( );
    }

    public static java.util.Collection<String> values ( ) {
        return map.values ( );
    }

}
