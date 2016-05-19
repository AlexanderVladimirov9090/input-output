import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by clouway on 19.05.16.
 */

/**
 * This class made for writing content in text file.
 */
public class Writer {

    /**
     * Writes content in the text file
     * @param content content that is written.
     * @param file
     */
    public void write(String content, String file){

        try (FileWriter writer = new FileWriter(file) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
