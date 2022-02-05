package Methods;
/*
     Задача 1. Написать метод, который бы возвращал из 2 чисел меньшее число. Обязательно использовать
     этот метод в main.
 */

import java.io.Serializable;

public class Task1 {

    public static void main (String[] args) {
        int num1 = 7;
        int num2 = 7;
        System.out.println ( "Даны числа " + num1 + " и " + num2 + ", меньшее число: " + minNum ( num1 ,num2 ) );
    }

    public static Serializable minNum (int num1 ,int num2) {
        if (num2 == num1) {
            return "Упс! Числа равны!";
        } else if (num1 < num2) {
            return num1;
        }
        return num2;
    }
}
