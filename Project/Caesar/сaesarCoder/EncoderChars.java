package Project.Caesar.сaesarCoder;

public class EncoderChars implements Coder {

    @Override
    public char coder (char temp ,int key) {
        key = key % 31;
        char exclamation = '!';
        char question = '?';
        char position;
        if (temp >= exclamation && temp <= question) {
            position = (char) (temp - exclamation);
        } else {
            return temp;
        }
        if (position >= (31 - key)) {
            temp = (char) (temp - (31 - key));
        } else {
            temp = (char) (temp + key);
        }
        return temp;
    }
}
