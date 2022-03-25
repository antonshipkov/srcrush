package Project.Caesar.Runner;

import Project.Caesar.IO.Encode;
import Project.Caesar.IO.Path;

import java.io.*;

public class encryptRunner implements Runner {

    @Override
    public void runner (int key) {
        try (FileReader reader = new FileReader ( Path.TEXT.getPath() );
             BufferedReader inStr = new BufferedReader ( reader );
             FileWriter writer = new FileWriter ( Path.ENCRYPT.getPath ());
             PrintWriter outStr = new PrintWriter (writer)) {
            Encode encode = new Encode ();
            encode.encode (inStr,outStr, key);
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}
