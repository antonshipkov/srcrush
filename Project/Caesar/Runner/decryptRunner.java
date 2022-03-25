package Project.Caesar.Runner;

import Project.Caesar.IO.Decode;
import Project.Caesar.IO.Path;

import java.io.*;

public class decryptRunner implements Runner {

    @Override
    public void runner (int key) {
        try (FileReader reader = new FileReader ( Path.ENCRYPT.getPath ( ) );
             BufferedReader inStr = new BufferedReader ( reader );
             FileWriter writer = new FileWriter ( Path.DECRYPT.getPath ( ) );
             PrintWriter outStr = new PrintWriter ( writer )) {
            Decode decode = new Decode ( );
            decode.decode ( inStr ,outStr ,key );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}
