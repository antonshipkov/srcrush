package Project.Caesar.Runner;

import Project.Caesar.IO.Path;
import Project.Caesar.IO.bruteforceDecode;

import java.io.*;

public class bruteforceDecryptRunner implements Runner {

    @Override
    public void runner (int outKey) {
        try (FileReader reader = new FileReader ( Path.ENCRYPT.getPath ( ) );
             BufferedReader inStr = new BufferedReader ( reader );
             FileWriter writer = new FileWriter ( Path.bruteforceDECRYPT.getPath ( ) );
             PrintWriter outStr = new PrintWriter ( writer )) {
            bruteforceDecode decode = new bruteforceDecode ( );
            decode.decode ( inStr ,outStr ,outKey );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}
