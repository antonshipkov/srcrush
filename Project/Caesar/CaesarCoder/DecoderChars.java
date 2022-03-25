package Project.Caesar.CaesarCoder;

public class DecoderChars implements Coder {

    @Override
    public char coder (char temp ,int key) {
        key = -key % 31;
        char exclamation = '!';
        char question = '?';
        char position;
        if (temp >= exclamation && temp <= question) {
            position = (char) (temp - exclamation);
        } else {
            return temp;
        }
        if (position + key < 0) {
            temp = (char) (temp + key + 31);
        } else {
            temp = (char) (temp + key);
        }
        return temp;
    }

}
