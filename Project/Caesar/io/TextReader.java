package Project.Caesar.io;

import java.io.*;

public class TextReader {
    public void reader (String path) {
        try (FileReader reader = new FileReader ( path );
             BufferedReader inStr = new BufferedReader ( reader )) {
            int c;
            while ((c = inStr.read ( )) != -1) {
                System.out.print ( (char) c );
            }
        } catch (IOException e) {
            e.printStackTrace ( );
        }

    }
}
