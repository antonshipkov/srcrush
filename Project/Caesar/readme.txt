  Программа Caesar реализует Шифр Цезаря — это шифр подстановки: в нем каждый символ в открытом тексте заменяется
  на символ, который находится на некотором постоянном числе позиций левее или правее него в алфавите. Программа
  шифрует/ расшифровывает строку, состоящую из букв латинского, русского алфавита, а также учитывает пунктуацию.
  Программа может учитывать регистр.

  Программы состоит из следующих папок: caesarCoder, io, runner, sources и класса CaesarMain.

  В классе Caesar Main реализован пользовательский интерфейс.
  В классе реализованы методы: getChoice ( ), getNum ( ), message ( ), messageBruteforce ( ), getChoiceBruteforce ( ).
  Метод getNum () считывает целое число из консоли и его возвращает.
  Метод getChoice ( )реализует switch, который позволяет сделать выбор из консоли и вызывает соответствующие классы,
  default реализует перезапуск метода, выход из программы возможен только при выборе соответствующего значения,
  согласно условия.
  Метод message ( ) выводит в консоль текстовую информацию для пользователя.
  messageBruteforce ( ) выводит в консоль информацию для пользователя. Метод getChoiceBruteforce ( )реализует switch,
  который позволяет пользователю сделать выбор из консоли, и возвращает необходимое число итераций (ключей) в
  соответствующий метод.


  Папка runner включает классы: bruteforceDecryptRunner, decryptRunner, encryptRunner, а также, interface Runner.
  В interface Runner есть один метод: public void runner (int key), который принимает значение типа int. Классы
  bruteforceDecryptRunner, decryptRunner, encryptRunner имплементируют interface Runner и реализуют его метод.
  В классах используются методы: BufferReader и PrintWriter, которые читают\записывают текст из потока\в поток.


  Папка io включает классы: bruteforceDecode, Decode, Encode, textReader.

  В классе textReader реализован метод reader (String path), который принимает строку (путь) к файлу. Метод читает в
  консоль информацию из файла. Сделал отдельным классом, т.к. используется в нескольких местах программы.
  Классы bruteforceDecode, Decode, Encode используют методы, схожие по своему функционалу. На примере класса Encode.
  В классе реализуется метод encode (BufferedReader inStr ,PrintWriter outStr ,int key). Метод принимает три параметра.
  По условию задачи можно использовать таблицу ASCII. В методе используется StringBuilder и StringTokenizer. Логика
  следующая: StringTokenizer разбивает строку на слова, каждое слово читается посимвольно.
  Символ передается в кодер, далее принимает зашифрованный символ, и далее символы запихиваются в StringBuilder, далее
  вся восстановленная строка записывается в файл. Реализация метода в классе bruteforceDecode немного отличается,
  но смысл тот же. Методы универсальные, с помощью небольших изменений в коде можно расширить функционал, для работы
  с дополнительными кодерами.


  Папка caesarCoder включает классы: EncoderChars, DecoderChars, EncoderEng, DecoderEng, EncoderRus, DecoderRus и
  interface Coder. В interface Coder есть один метод: public char coder (char temp ,int key). Данный интерфейс
  имплементят все кодеры. Кодеры принимают символ и ключ, возвращают символ по ключу. Кодеры универсальные, т.е.
  каждый можно использовать отдельно, естественно с ограничениями по поставленной задаче. Можно дописать дополнительные
  классы кодеры для расширения возможностей программы, для шифрования/дешифрования других алфавитов.

  В папке Sources находятся все файлы.
