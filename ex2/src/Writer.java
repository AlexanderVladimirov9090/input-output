import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by clouway on 19.05.16.
 */
public class Writer {




    public void write(String content, TextFile file){
        try (FileWriter writer = new FileWriter(file.fileName())) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
