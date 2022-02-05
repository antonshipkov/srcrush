package Methods;

/*
   Задача 5. Написать метод, который будет иметь два целочисленных параметра a и b, и в качестве своего
             значения возвращать случайное целое число из отрезка [a;b]. Обязательно использовать его в main.
 */

public class Task5 {
    public static void main (String[] args) {
        int a = 1;
        int b = -4;
        int randomNum = random ( a ,b );
        System.out.println("Случайное число из отрезка: " + randomNum);

    }

    public static int random (int a ,int b) {
        if (a < b) {
            return (int) (Math.random ( ) * (b - a + 1)) + a;
        } else {
            return (int) (Math.random ( ) * (a - b + 1)) + b;
        }
    }

}
