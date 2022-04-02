package Project.Caesar.сaesarCoder;

public class EncoderEng implements Coder {

    @Override
    public char coder (char temp ,int key) {
        key = key % 26;
        char a = 'a';
        char A = 'A';
        char position;
        if (temp >= a && temp <= 'z') {
            position = (char) (temp - a);
        } else if (temp >= A && temp <= 'Z') {
            position = (char) (temp - A);
        } else {
            return temp;
        }
        if (position >= (26 - key)) {
            temp = (char) (temp - (26 - key));
        } else {
            temp = (char) (temp + key);
        }
        return temp;
    }
}
