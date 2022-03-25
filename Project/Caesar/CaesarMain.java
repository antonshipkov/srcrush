package Project.Caesar;

import Project.Caesar.IO.Path;
import Project.Caesar.IO.textReader;
import Project.Caesar.Runner.Runner;
import Project.Caesar.Runner.bruteforceDecryptRunner;
import Project.Caesar.Runner.decryptRunner;
import Project.Caesar.Runner.encryptRunner;

import java.util.Scanner;


public class CaesarMain {

    static Runner encryptRun = new encryptRunner ( );
    static textReader reader = new textReader ( );
    static Runner decryptRun = new decryptRunner ( );
    static Runner bruteforceDecryptRun = new bruteforceDecryptRunner ( );

    public static void main (String[] args) {

        message ( );
        getChoice ( );
    }

    public static void getChoice ( ) {
        int num = getNum ( );
        switch (num) {
            case 1 -> {
                System.out.println ( "Первоночальный текст из файла: " );
                reader.reader ( Path.TEXT.getPath ( ) );
                System.out.println ( "" );
                message ( );
                getChoice ( );
            }
            case 2 -> {
                System.out.print ( "Введите целочисленное число - ключ: " );
                int key = Math.abs ( getNum ( ) );
                System.out.println ( "Закодированный текст с ключом " + key + ": " );
                encryptRun.runner ( key );
                reader.reader ( Path.ENCRYPT.getPath ( ) );
                System.out.println ( "" );
                message ( );
                getChoice ( );
            }
            case 3 -> {
                System.out.print ( "Введите целочисленное число - ключ: " );
                int key = Math.abs ( getNum ( ) );
                System.out.println ( "Разкодированный текст с ключом " + key + ": " );
                decryptRun.runner ( key );
                reader.reader ( Path.DECRYPT.getPath ( ) );
                System.out.println ( "" );
                message ( );
                getChoice ( );

            }
            case 4 -> {
                System.out.print ( "Введите целочисленное число возможных ключей: " );
                int key = Math.abs ( getNum ( ) );
                System.out.println ( "Разкодированный текст методом bruteforce с начальным ключом 0 " +
                        "и конечным ключем " + key + ": " );
                bruteforceDecryptRun.runner ( key );
                reader.reader ( Path.bruteforceDECRYPT.getPath ( ) );
                message ( );
                getChoice ( );

            }
            case 5 -> {
                System.out.println ( "Вы вышли из программы!" );

            }
            default -> {
                System.out.println ( "Вы выбрали не существующий вариант!" );
                message ( );
                getChoice ( );
            }
        }
    }

    public static int getNum ( ) {
        Scanner in = new Scanner ( System.in );
        int num;
        if (in.hasNextInt ( )) {
            num = in.nextInt ( );
        } else {
            System.out.println ( "Ввели не целое число. Попробуйте еще раз." );
            in.next ( );
            num = getNum ( );
        }
        return num;
    }

    public static void message ( ) {

        System.out.println ( "***************************************************************" );
        System.out.println ( "Что бы прочитать текст из файла выбирите: 1 " + '\n' +
                "Что бы зашифровать текст методом Caesar Cipher с помощью ключа выбирите: 2" + '\n' +
                "Что бы расшифровать текст методом Caesar Cipher с помощью ключа выбирите: 3" + '\n' +
                "Что бы расшифровать текст методом Caesar Cipher с помощью bruteforce выбирите: 4" + '\n' +
                "Для выхода выбирите: 5" );
        System.out.println ( "" );
        System.out.print ( "Сделайте выбор: " );
    }
}
