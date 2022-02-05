package Methods;

/*
    Задача 2. Написать методы, который возводит число в степень.
    Обязательно использовать его в main.
 */

public class Task2 {
    public static void main (String[] args) {

        double num = 2;
        int pow = -2;



        System.out.printf ( "Число %s в степени %d = %s%n" ,num ,pow ,pow ( num , pow) );
    }

    public static double pow (double num ,int pow) {

        return Math.pow(num,pow);
    }

}
