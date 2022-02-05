package Loops;

/*
Задача 4. Вывести на экран снег (зима же все таки)):
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
Использовать циклы.
 */

public class Task4 {
    public static void main (String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print ( "* " );
            }
            System.out.println ( );
        }
    }
}
