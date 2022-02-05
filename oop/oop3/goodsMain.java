package oop.oop3;

/*
   Задача 2.
   Есть две категории товаров 'Товары группы А' и 'Товары группы В'.
   а)Если покупатель берет три и более товара группы А, то получает скидку 10%.
   б) если берет три и более товаров группы B - получает скидку 12%.
   в) если берет хотя бы по одному товару из обеих групп - получает скидку 8%.
   Дайте покупателю сделать выбор товаров и посчитайте итоговую сумму покупки.
   Задачу можно решать любыми доступными вам способами)
 */


import java.util.Scanner;

public class goodsMain {

    private static final Scanner scanner = new Scanner ( System.in );
    private static final Order order = new Order ( );

    public static void main (String[] args) {


        System.out.println ( "Выберите товар по ID из группы А: " + "\n" + "1. Груша - 5 р " + "\n" +
                "2. Помидор - 2 р" + "\n" + "3. Морковь - 1 р " + "\n" + "4. Клубника - 7 р" );
        System.out.println ( "Выберите товар по ID из группы В: " + "\n" + "5. Стелька - 2 р " + "\n" +
                "6. Носки - 6 р" + "\n" + "7. Вешалка - 4 р " + "\n" + "8. Мыло - 7 р" );
        System.out.println ( );

        run ( );
        System.out.println (order.toString ());

    }

    public static void run ( ) {
        boolean run = true;
        System.out.println ( "Вы хотите выбрать товар? да или нет" );
        while (run) {
            String word = "";
            if (scanner.hasNextLine ( )) {
                word = scanner.nextLine ( );
                if (word.equalsIgnoreCase ( "да" )) {
                    int num = getID ( );
                    int ord = getOrder ( num );
                    System.out.println ( ord );
                    System.out.println ("Вы выбрали: " + order.getName () + " " + order.getPrice () + " р");
                    order.sum ( );
                    order.goodsList ( );
                    order.ListOfCounts ( );
                    order.sumWithDiscount ();
                    run ( );
                } else {
                    run = false;
                }
            }
        }
    }

    public static int getID ( ) {
        System.out.println ( "Введите ID: " );
        int num;
        if (scanner.hasNextInt ( )) {
            num = scanner.nextInt ( );
        } else {
            System.out.println ( "Ввели не целое число. Попробуйте еще раз." );
            scanner.next ( );
            num = getID ( );
        }
        return num;
    }

    public static int getOrder (int num) {

        switch (num) {
            case 1 -> {
                order.setName ( "Груша" );
                order.setPrice ( 5 );
            }
            case 2 -> {
                order.setName ( "Помидор" );
                order.setPrice ( 2 );
            }
            case 3 -> {
                order.setName ( "Морковь" );
                order.setPrice ( 1 );
            }
            case 4 -> {
                order.setName ( "Клубника" );
                order.setPrice ( 7 );
            }
            case 5 -> {
                order.setName ( "Стелька" );
                order.setPrice ( 2 );
            }
            case 6 -> {
                order.setName ( "Носки" );
                order.setPrice ( 6 );
            }
            case 7 -> {
                order.setName ( "Вешалка" );
                order.setPrice ( 4 );
            }
            case 8 -> {
                order.setName ( "Мыло" );
                order.setPrice ( 7 );
            }
            default -> System.out.println ( "Ввели не верный ID Повторите ввод." );
        }
        return num;
    }
}
