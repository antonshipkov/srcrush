package Project.Caesar.runner;

import Project.Caesar.io.BruteforceDecode;

import java.io.*;

public class BruteforceDecrypt implements Runner {

    @Override
    public void runner (int outKey) {
        try (FileReader reader = new FileReader ( "src/Project/Caesar/sources/encryptText.txt" );
             BufferedReader inStr = new BufferedReader ( reader );
             FileWriter writer = new FileWriter ( "src/Project/Caesar/sources/bruteforceDecryptText.txt" );
             PrintWriter outStr = new PrintWriter ( writer )) {
            BruteforceDecode decode = new BruteforceDecode ( );
            decode.decode ( inStr ,outStr ,outKey );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}
