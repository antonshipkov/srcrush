package Project.Caesar.io;

import Project.Caesar.сaesarCoder.Coder;
import Project.Caesar.сaesarCoder.DecoderChars;
import Project.Caesar.сaesarCoder.DecoderEng;
import Project.Caesar.сaesarCoder.DecoderRus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class BruteforceDecode {
    public void decode (BufferedReader inStr ,PrintWriter outStr ,int outKey) throws IOException {
        String line = inStr.readLine ( );
        StringBuilder textLine = new StringBuilder ( );
        StringBuilder text = new StringBuilder ( );
        Coder decoderEng = new DecoderEng ( );
        Coder decoderRus = new DecoderRus ( );
        Coder decoderChars = new DecoderChars ( );
        StringTokenizer tok;
        for (int j = 0; j <= outKey; j++) {
            String tempLine = line;
            while (tempLine != null) {
                tok = new StringTokenizer ( tempLine );
                while (tok.hasMoreTokens ( )) {
                    String wordIn = tok.nextToken ( );
                    StringBuilder wordOut = new StringBuilder ( );
                    for (int i = 0; i < wordIn.length ( ); i++) {
                        char c = wordIn.charAt ( i );
                        char o;
                        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                            o = decoderEng.coder ( c ,j );
                        } else if ((c >= 'а' && c <= 'я') || (c >= 'А' && c <= 'Я')) {
                            o = decoderRus.coder ( c ,j );
                        } else {
                            o = decoderChars.coder ( c ,j );
                        }
                        wordOut.append ( o );
                    }
                    textLine.append ( wordOut ).append ( " " );
                }
                text.append ( "Результат при ключе " ).append ( j ).append ( ": " ).append ( textLine ).append ( '\n' );
                textLine.setLength ( 0 );
                tempLine = inStr.readLine ( );
            }
        }
        outStr.write ( String.valueOf ( text ) );
    }
}
