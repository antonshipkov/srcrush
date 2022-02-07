package Collections.Task2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class toyMain {

    private final static HashMap<String, String> map = new HashMap<> ( );


    public static void main (String[] args) {
        Toy toy1 = new Toy ( "жираф" ,"высокий" );
        Toy toy2 = new Toy ( "зайчик" ,"средний" );
        Toy toy3 = new Toy ( "бегемот" ,"большой" );
        Toy toy4 = new Toy ( "мишка" ,"маленький" );

        map.put ( toy1.name ,toy1.profile );
        map.put ( toy2.name ,toy2.profile );
        map.put ( toy3.name ,toy3.profile );
        map.put ( toy4.name ,toy4.profile );

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
