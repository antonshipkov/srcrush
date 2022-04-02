package Project.Caesar.runner;

import Project.Caesar.io.Decode;

import java.io.*;

public class Decrypt implements Runner {

    @Override
    public void runner (int key) {
        try (FileReader reader = new FileReader ( "src/Project/Caesar/sources/encryptText.txt" );
             BufferedReader inStr = new BufferedReader ( reader );
             FileWriter writer = new FileWriter ( "src/Project/Caesar/sources/decryptText.txt" );
             PrintWriter outStr = new PrintWriter ( writer )) {
            Decode decode = new Decode ( );
            decode.decode ( inStr ,outStr ,key );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}
