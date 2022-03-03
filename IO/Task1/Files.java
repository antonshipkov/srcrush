package IO.Task1;

/*
    Задача 1.
    Написать класс, который копирует содержимое из одного файла в другой. В нем создать два метода: первый -
    копирует использую только FileReader и FileWriter, второй - копирует используя классы BufferedReader, FileReader,
    BufferedWriter, FileWriter.
    С помощью System.currentTimeMillis() посмотреть, какой из методов отработает быстрее (файл из которого копируется
    информация в обоих случаях должен быть один и тот же).
 */

import java.io.*;

public class Files {
    public static void main (String[] args) throws IOException {
        String text = "C:\\Users\\Anton\\IdeaProjects\\RushHomeWork\\src\\IO\\Task1\\text.txt";

        timer ( writer ( text ) ,bufferWriter ( text ) );

    }

    public static long writer (String text) throws IOException {
        long time = System.nanoTime ( );
        try (FileReader reader = new FileReader ( text );
             FileWriter writer = new FileWriter ( "C:\\Users\\Anton\\IdeaProjects\\" +
                     "RushHomeWork\\src\\IO\\Task1\\text1.txt" )) {
            char[] buffer = new char[65536];
            while (reader.ready ( )) {
                int real = reader.read ( buffer );
                writer.write ( buffer ,0 ,real );
            }
        }
        time = System.nanoTime ( ) - time;
        return time;
    }

    public static long bufferWriter (String text) throws IOException {
        long time = System.nanoTime ( );
        try (FileReader in = new FileReader ( text ); BufferedReader reader = new BufferedReader ( in );
             FileWriter fw = new FileWriter ( "C:\\Users\\Anton\\IdeaProjects\\" +
                     "RushHomeWork\\src\\IO\\Task1\\text2.txt" ); BufferedWriter bw = new BufferedWriter ( fw )) {
            char[] buffer = new char[65536];
            while (reader.ready ( )) {
                int real = reader.read ( buffer );
                bw.write ( buffer ,0 ,real );
            }
        }
        time = System.nanoTime ( ) - time;
        return time;
    }

    public static void timer (long time1 ,long time2) {
        System.out.printf ( "writer %,9.3f ms\n" ,time1 / 1_000_000.0 );
        System.out.printf ( "bufferWriter %,9.3f ms\n" ,time2 / 1_000_000.0 );
        if (time1 > time2) {
            System.out.println ( "Метод bufferWriter быстрее Writer на: " + (time1 - time2) / 1_000_000.0 + " ms" );
        } else if (time1 < time2) {
            System.out.println ( "Метод writer быстрее bufferWriter на: " + (time2 - time1) / 1_000_000.0 + " ms" );
        } else {
            System.out.println ( "Скорости выполнения равны" );
        }
    }
}
