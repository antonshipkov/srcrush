package Methods;

/*
  Задача 3. Написать простой консольный калькулятор, в котором будут следующие методы:
            1) метод должен считывать с консоли целое число и возвращать его
            2) метод должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, *, /)
            3) метод должен выполнять над двумя числами арифметическую операцию
            4) метод main должен считывать 2 числа, считывать операцию(+, -, *, /), производить арифметическую
               операцию и выводить результат в консоль (использовать все раннее указанные методы).
 */

import java.util.Scanner;

public class Task3 {
    static Scanner scanner = new Scanner ( System.in );

    public static void main (String[] args) {
        int num1 = getInt ( );
        int num2 = getInt ( );
        char operation = getOperation ( );
        int result = calc ( num1 ,num2 ,operation );
        System.out.println ( "Результат операции : " + result );
    }

    public static int getInt ( ) {
        System.out.println ( "Введите число:" );
        int num;
        if (scanner.hasNextInt ( )) {
            num = scanner.nextInt ( );
        } else {
            System.out.println ( "Ввели не целое число. Попробуйте еще раз." );
            scanner.next ( );
            num = getInt ( );
        }
        return num;
    }

    public static char getOperation ( ) {
        System.out.println ( "Введите символ операции ( +, -, *, / ): " );
        char operation;
        if (scanner.hasNext ( )) {
            operation = scanner.next ( ).charAt ( 0 );
        } else {
            System.out.println ( "Вы ввели не операцию. Попробуйте еще раз." );
            scanner.next ( );
            operation = getOperation ( );
        }
        return operation;
    }

    public static int calc (int num1 ,int num2 ,char operation) {
        int result;
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> {
                System.out.println ( "Операция не понятна. Повторите ввод." );
                result = calc ( num1 ,num2 ,getOperation ( ) );
            }
        }
        return result;
    }
}
