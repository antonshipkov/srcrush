package oop.oop1;

/*
   Задача 2.
   Создайте абстракный класс ЭлетроТовар, который содержит переменные производитель,
   модель, вес и цена.
   Добавить в класс ЭлектроТовары метод, который будет выводить на консоль описание
   данного товара с учетом всех выше созданных переменных.
   Создать классы, которые будут наследовать ЭлектоТовар: Телефон, Планшет,
   Телевизор. Добавить в каждый созданный класс свой произвольный метод.
   В классе Планшет переопределить метод родительского класса. Он будет выводить на
   консоль только модель и цену планшета.
   Создать по два экземпляра каждого класса. Заполнить все переменные значениями и
   вызвать все созданные методы.
   Использовать ли конструкторы, а также геттеры и сеттеры вы определяете сами)))
 */

public class ElectricalGoodsMain {

    public static void main (String[] args) {


        phone ( );
        System.out.println ( );

        TV ( );
        System.out.println ( );

        tablet ( );
    }

    public static void phone ( ) {
        Phone phone1 = new Phone ( );
        Phone phone2 = new Phone ( );

        phone2.phone ( );

        phone2.setProducer ( "Nokia" );
        phone2.setModel ( "3210" );
        phone2.setPrice ( 400 );
        phone2.setWeight ( 100 );
        System.out.println(phone2.electricalGoodsPrint ());

        phone1.setProducer ( "Sony" );
        phone1.setModel ( "Xperia" );
        phone1.setPrice ( 500 );
        phone1.setWeight ( 110 );
        System.out.println (phone1.electricalGoodsPrint ());

    }

    public static void TV ( ) {
        TV tv1 = new TV ( );
        TV tv2 = new TV ( );

        tv1.tv ( );

        tv1.setProducer ( "Samsung" );
        tv1.setModel ( "4500" );
        tv1.setPrice ( 700 );
        tv1.setWeight ( 5000 );
        System.out.println (tv1.electricalGoodsPrint ());

        tv2.setProducer ( "Sony" );
        tv2.setModel ( "2213" );
        tv2.setPrice ( 900 );
        tv2.setWeight ( 6700 );
        System.out.println (tv2.electricalGoodsPrint ());
    }

    public static void tablet ( ) {

        Tablet tablet1 = new Tablet ( "3200", 400 );
        tablet1.tablet ( );
        System.out.println ( tablet1.electricalGoodsPrint ());
        Tablet tablet2 = new Tablet ( "4314", 550);
        System.out.println(tablet2.electricalGoodsPrint ());
    }
}
