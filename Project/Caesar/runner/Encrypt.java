package Project.Caesar.runner;

import Project.Caesar.io.Encode;

import java.io.*;

public class Encrypt implements Runner {

    @Override
    public void runner (int key) {
        try (FileReader reader = new FileReader ( "src/Project/Caesar/sources/inText.txt" );
             BufferedReader inStr = new BufferedReader ( reader );
             FileWriter writer = new FileWriter ( "src/Project/Caesar/sources/encryptText.txt" );
             PrintWriter outStr = new PrintWriter ( writer )) {
            Encode encode = new Encode ( );
            encode.encode ( inStr ,outStr ,key );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}
