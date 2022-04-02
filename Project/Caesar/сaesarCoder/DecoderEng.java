package Project.Caesar.сaesarCoder;

public class DecoderEng implements Coder {

    @Override
    public char coder (char temp ,int key) {
        key = -key % 26;
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
        if (position + key < 0) {
            temp = (char) (temp + key + 26);
        } else {
            temp = (char) (temp + key);
        }
        return temp;
    }


}
