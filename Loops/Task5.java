package Loops;

/*
Задача 5. Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
          А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
          За каждый месяц банк начисляет к сумме вклада 1.2% от суммы.
 */

import java.util.Scanner;

public class Task5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Введите сумму вклада" );
        if (scanner.hasNextDouble ( )) {
            double ammount = scanner.nextDouble ( );
            if (ammount > 0) {
                System.out.println ( "Введите колличество месяцев вклада, ставка 1,2% в мес" );
                if (scanner.hasNextInt ( )) {
                    int month = scanner.nextInt ( );
                    if (month > 0) {
                        for (int i = 1; i <= month; i++) {
                            ammount += (ammount * 0.012);
                        }
                        System.out.println ( "Сумма вклада с процентами за " + month + " месяцев = " +
                                String.format ( "%.2f" ,ammount ) );

                    } else {
                        System.out.println ( "Колличество месяцев не может быть меньше нуля" );
                    }
                } else {
                    System.out.println ( "Ввели не колличество месяцев" );
                }

            } else {
                System.out.println ( "Сумма вклада не может быть меньше 0" );
            }
        } else {
            System.out.println ( "Введено не число" );
        }
    }
}
