package oop.oop2;

/*
Задача 1.
Создать класс Student, который содержит:
a) поля firstName, lastName, age, averageRating.
б) методы study() и relax(), в которых просто вывести на консоль текстовые сообщения.
в) Добавьте три конструктора  - Student(), Student(firstName, lastName), Student(firstName, lastName, age, averageRating).
Создайте три объекта этого класса. Каждый объект должен быть инициализирован разным конструктором.
 */

public class Student {
    String firstName;
    String lastName;
    int age;
    double averageRating;

    public Student (String firstName ,String lastName ,int age ,double averageRating) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageRating = averageRating;
    }

    public Student (String firstName ,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;


    }

    public Student ( ) {


    }

    public static void study ( ) {

        System.out.println ( "Учимся" );
    }

    public static void relax ( ) {

        System.out.println ( "Отдыхаем" );
    }

    @Override
    public String toString ( ) {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", averageRating=" + averageRating +
                '}';
    }

    public static void main (String[] args) {
        Student student1 = new Student ( "Юра" ,"Трутяга" ,19 ,41.2 );
        Student student2 = new Student ( "Толян" ,"Прогульщик" );
        Student student3 = new Student ();
        System.out.println ( "Список студентов: " );
        System.out.println ( student1.toString ( ) );
        System.out.println ( student2.toString ( ) );
        System.out.println ( student3.toString ( ) );
    }
}
