package IO.Task2;

/*
   Задача 2.
   Создать класс Employee, у которого есть fullname и salary.
   Создать массив либо коллекцию содержащую несколько объектов этого типа.
   Создать класс Report с методом generateReport, в котором выводится информация о зарплате всех сотрудников.
   Добавить метод в класс Employee, который будет записывать report в файл repotr.txt.
   Используем класс PrintWriter.

 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class employeeMain {
    public static void main (String[] args) throws IOException {
        Report report = new Report ( );
        Employee employee = new Employee ( );
        List<Employee> list = new ArrayList<> ( );
        list.add ( new Employee ( "Вася" ,200 ) );
        list.add ( new Employee ( "Петя" ,300 ) );
        list.add ( new Employee ( "Паша" ,500 ) );
        report.generateReport ( list );
        employee.writer ( list );

    }
}
