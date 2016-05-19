import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by clouway on 18.05.16.
 */
public class TextFile {
    private File file;
    private String nameOfFile;

    public TextFile(String nameOfFile) {

        this.nameOfFile = nameOfFile;
    }

    /**
     * Creating file.
     */
    public void createFile() {

        if (file == null) {
            File directory = new File("/src");
            file = new File(directory, nameOfFile);
        }
    }

    /**
     * Returns file name.
     * @return string nameOfFile.
     */
    public String fileName() {
        return nameOfFile;
    }
}
