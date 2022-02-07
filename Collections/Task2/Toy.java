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

public class Toy {


    String name;
    String profile;

    public Toy (String name ,String profile) {
        this.name = name;
        this.profile = profile;
    }
}
