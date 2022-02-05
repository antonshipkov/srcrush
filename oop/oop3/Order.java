package oop.oop3;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String name;
    private double price;
    private double sum;
    private double discount;
    private double sumDiscount;
    private int countA;
    private int countB;
    private final List<String> array = new ArrayList<> ( );
    private static final String[] grA = {"Груша" ,"Помидор" ,"Морковь" ,"Клубника"};
    private static final String[] grB = {"Стелька" ,"Носки" ,"Вешалка" ,"Мыло"};


    public String getName ( ) {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public double getPrice ( ) {
        return price;
    }

    public void setPrice (double price) {
        this.price = price;
    }



    @Override
    public String toString ( ) {
        return "Список купленных товаров :" + array + "\n" +
                "Сумма покупок: " + sum + " р" + "\n" + "Скидка: " + discount + " %"
                 + "\n" + "Сумма покупок с учетом скидки: " + sumDiscount + " р";

    }

    public void sum ( ) {
        sum = sum + getPrice ( );
    }

    public void ListOfCounts ( ) {

        for (String s : grA) {
            if (s.equals ( getName ( ) )) {
                countA++;
            }
        }

        for (String s : grB) {
            if (s.equals ( getName ( ) )) {
                countB++;
            }
        }
        if (countB >= 3) {
            discount = 12;
        } else if (countA >= 3) {
            discount = 10;
        } else if (countA >= 1 && countB >= 1) {
            discount = 8;
        } else {
            discount = 0;
        }
    }

    public void sumWithDiscount ( ) {
        sumDiscount = sum - (discount * sum) / 100;
    }

    public void goodsList ( ) {
        array.add ( getName ( ) );
    }
}
