package Project.Caesar;

import Project.Caesar.io.TextReader;
import Project.Caesar.runner.Runner;
import Project.Caesar.runner.BruteforceDecrypt;
import Project.Caesar.runner.Decrypt;
import Project.Caesar.runner.Encrypt;

import java.util.Scanner;


public class CaesarMain {

    static Runner encryptRun = new Encrypt ( );
    static TextReader reader = new TextReader ( );
    static Runner decryptRun = new Decrypt ( );
    static Runner bruteforceDecryptRun = new BruteforceDecrypt ( );

    public static void main (String[] args) {

        message ( );
        getChoice ( );
    }

    public static void getChoice ( ) {
        int num = getNum ( );
        switch (num) {
            case 1 -> {
                System.out.println ( "Первоночальный текст из файла: " );
                reader.reader ( "src/Project/Caesar/sources/inText.txt" );
                System.out.println ( "" );
                message ( );
                getChoice ( );
            }
            case 2 -> {
                System.out.print ( "Введите целочисленное число - ключ: " );
                int key = Math.abs ( getNum ( ) );
                System.out.println ( "Закодированный текст с ключом " + key + ": " );
                encryptRun.runner ( key );
                reader.reader ( "src/Project/Caesar/sources/encryptText.txt" );
                System.out.println ( "" );
                message ( );
                getChoice ( );
            }
            case 3 -> {
                System.out.print ( "Введите целочисленное число - ключ: " );
                int key = Math.abs ( getNum ( ) );
                System.out.println ( "Разкодированный текст с ключом " + key + ": " );
                decryptRun.runner ( key );
                reader.reader ( "src/Project/Caesar/sources/decryptText.txt" );
                System.out.println ( "" );
                message ( );
                getChoice ( );
            }
            case 4 -> {
                messageBruteforce ( );
                bruteforceDecryptRun.runner ( getChoiceBruteforce ( ) );
                reader.reader ( "src/Project/Caesar/sources/bruteforceDecryptText.txt" );
                System.out.println ( "" );
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

    public static int getChoiceBruteforce ( ) {
        int num = getNum ( );
        switch (num) {
            case 1 -> {
                System.out.println ( "Расшифрованный текст из файла на латинском языке: " );
                return 57;
            }
            case 2 -> {
                System.out.println ( "Расшифрованный текст из файла на русском языке: " );
                return 64;

            }
            case 3 -> {
                System.out.println ( "Любой расшифрованный текст: " );
            }
            default -> {
                System.out.println ( "Вы выбрали не существующий вариант!" );
                messageBruteforce ( );
                getChoiceBruteforce ( );
            }
        }
        return 90;
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

    public static void messageBruteforce ( ) {

        System.out.println ( "***************************************************************" );
        System.out.println ( "Что бы расшифровать текст на латинском языке выбирите: 1 " + '\n' +
                "Что бы расшифровать текст на русском языке выбирите: 2 " + '\n' +
                "Что бы расшифровать любой текст выбирите : 3" );
        System.out.println ( "" );
        System.out.print ( "Сделайте выбор: " );
    }
}
