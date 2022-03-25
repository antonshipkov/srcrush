package Project.Caesar.IO;

import java.io.File;

public enum Path {
    TEXT ( getSep ( ) + "C:" + getSep ( ) + "Users" + getSep ( ) + "Anton" + getSep ( ) + "IdeaProjects" +
            getSep ( ) + "RushHomeWork" + getSep ( ) + "src" + getSep ( ) + "Project" + getSep ( ) + "Caesar" + getSep ( ) +
            "Sources" + getSep ( ) + "inText.txt" ),
    ENCRYPT ( getSep ( ) + "C:" + getSep ( ) + "Users" + getSep ( ) + "Anton" + getSep ( ) + "IdeaProjects" +
            getSep ( ) + "RushHomeWork" + getSep ( ) + "src" + getSep ( ) + "Project" + getSep ( ) + "Caesar" + getSep ( ) +
            "Sources" + getSep ( ) + "encryptText.txt" ),
    DECRYPT ( getSep ( ) + "C:" + getSep ( ) + "Users" + getSep ( ) + "Anton" + getSep ( ) + "IdeaProjects" +
            getSep ( ) + "RushHomeWork" + getSep ( ) + "src" + getSep ( ) + "Project" + getSep ( ) + "Caesar" + getSep ( ) +
            "Sources" + getSep ( ) + "decryptText.txt" ),
    bruteforceDECRYPT ( getSep ( ) + "C:" + getSep ( ) + "Users" + getSep ( ) + "Anton" + getSep ( ) + "IdeaProjects" +
    getSep ( ) + "RushHomeWork" + getSep ( ) + "src" + getSep ( ) + "Project" + getSep ( ) + "Caesar" + getSep ( ) +
            "Sources" + getSep ( ) + "bruteforceDecryptText.txt" );

    private final String path;

    Path (String path) {
        this.path = path;
    }

    public static String getSep ( ) {
        return File.separator;
    }

    public String getPath ( ) {
        return path;
    }
}

