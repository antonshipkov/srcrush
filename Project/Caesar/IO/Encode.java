package Project.Caesar.IO;

import Project.Caesar.CaesarCoder.Coder;
import Project.Caesar.CaesarCoder.EncoderChars;
import Project.Caesar.CaesarCoder.EncoderEng;
import Project.Caesar.CaesarCoder.EncoderRus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Encode {

    public void encode (BufferedReader inStr ,PrintWriter outStr ,int key) throws IOException {
        String line = inStr.readLine ( );
        StringBuilder text = new StringBuilder ( );
        Coder encoderEng = new EncoderEng ( );
        Coder encoderRus = new EncoderRus ( );
        Coder encoderChars = new EncoderChars ( );
        StringTokenizer tok;
        while (line != null) {
            tok = new StringTokenizer ( line );
            while (tok.hasMoreTokens ( )) {
                String wordIn = tok.nextToken ( );
                StringBuilder wordOut = new StringBuilder ( );
                for (int i = 0; i < wordIn.length ( ); i++) {
                    char c = wordIn.charAt ( i );
                    char o;
                    if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                        o = encoderEng.coder ( c ,key );
                    } else if ((c >= 'а' && c <= 'я') || (c >= 'А' && c <= 'Я')) {
                        o = encoderRus.coder ( c ,key );
                    } else {
                        o = encoderChars.coder ( c ,key );
                    }
                    wordOut.append ( o );
                }
                text.append ( wordOut ).append ( " " );
            }
            line = inStr.readLine ( );
        }
        outStr.write ( String.valueOf ( text ) );
    }
}
