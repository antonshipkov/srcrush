package Project.Caesar.CaesarCoder;

public class EncoderRus implements Coder {

    @Override
    public char coder (char temp, int key) {
        key = key % 33;
        char a = 'а';
        char A = 'А';
        char position;
        if (temp >= a && temp <= 'я') {
            position = (char) (temp - a);
        } else if (temp >= A && temp <= 'Я') {
            position = (char) (temp - A);
        } else {
            return temp;
        }
        if (position >= (33 - key)) {
            temp = (char) (temp - (33 - key));
        } else {
            temp = (char) (temp + key);
        }
        return temp;
    }
}
