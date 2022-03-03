package IO.Task3;

/*
   Задча 3.
   Создать и заполнить файл только целыми числами с клавиатуры(не дать пользователю ввести что-либо другое).
   Считать информацию из этого файла, отсортировать числа по возрастанию и записать их в другой файл.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class numbersMain {
    private static List<Integer> readNumbers;

    public static void main (String[] args) {
        Scanner scanner = new Scanner ( System.in );
        List<Integer> numbers = new ArrayList<> ( );
        boolean isTrue = true;
        while (isTrue) {
            System.out.println ( "Введите целое число, для выхода введите не целое число " );
            if (scanner.hasNextInt ( )) {
                numbers.add ( scanner.nextInt ( ) );
            } else {
                isTrue = false;
            }
        }
        System.out.println ( numbers );
        writer ( numbers );
        reader ( );
        System.out.println ( sort ( ) );
        sortedNumWriter ( );

    }

    public static void writer (List<Integer> numbers) {
        try (FileOutputStream fos = new FileOutputStream ( "C:\\Users\\Anton\\IdeaProjects\\RushHomeWork\\src\\IO\\Task3\\txt.txt" );
             ObjectOutputStream oos = new ObjectOutputStream ( fos )) {
            oos.writeObject ( numbers );
        } catch (FileNotFoundException e) {
            e.printStackTrace ( );
            System.out.println ( "Не можем найти файл" );
        } catch (IOException e) {
            e.printStackTrace ( );
            System.out.println ( "Ошибка по работе с подсистемой ввода\\вывода" );
        }
    }

    public static void reader ( ) {

        try (FileInputStream fis = new FileInputStream ( "C:\\Users\\Anton\\IdeaProjects\\RushHomeWork\\src\\IO\\Task3\\txt.txt" );
             ObjectInputStream ois = new ObjectInputStream ( fis )) {
            readNumbers = (List<Integer>) ois.readObject ( );

        } catch (FileNotFoundException e) {
            e.printStackTrace ( );
            System.out.println ( "Не можем найти файл" );
        } catch (IOException e) {
            e.printStackTrace ( );
            System.out.println ( "Ошибка по работе с подсистемой ввода\\вывода" );
        } catch (ClassNotFoundException e) {
            e.printStackTrace ( );
        }

    }

    public static List<Integer> sort ( ) {
        Collections.sort ( readNumbers );
        return readNumbers;
    }

    public static void sortedNumWriter ( ) {
        try (FileOutputStream fos = new FileOutputStream ( "C:\\Users\\Anton\\IdeaProjects\\RushHomeWork\\src\\IO\\Task3\\txt1.txt" );
             ObjectOutputStream oos = new ObjectOutputStream ( fos )) {
            oos.writeObject ( readNumbers );
        } catch (FileNotFoundException e) {
            e.printStackTrace ( );
            System.out.println ( "Не можем найти файл" );
        } catch (IOException e) {
            e.printStackTrace ( );
            System.out.println ( "Ошибка по работе с подсистемой ввода\\вывода" );
        }
    }
}

