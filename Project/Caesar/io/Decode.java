package Project.Caesar.io;

import Project.Caesar.сaesarCoder.Coder;
import Project.Caesar.сaesarCoder.DecoderChars;
import Project.Caesar.сaesarCoder.DecoderEng;
import Project.Caesar.сaesarCoder.DecoderRus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Decode {

    public void decode (BufferedReader inStr ,PrintWriter outStr ,int key) throws IOException {
        String line = inStr.readLine ( );
        StringBuilder text = new StringBuilder ( );
        Coder decoderEng = new DecoderEng ( );
        Coder decoderRus = new DecoderRus ( );
        Coder decoderChars = new DecoderChars ( );
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
                        o = decoderEng.coder ( c ,key );
                    } else if ((c >= 'а' && c <= 'я') || (c >= 'А' && c <= 'Я')) {
                        o = decoderRus.coder ( c ,key );
                    } else {
                        o = decoderChars.coder ( c ,key );
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
