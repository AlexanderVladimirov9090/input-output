import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by clouway on 19.05.16.
 */
public class ExistedFile {
    private String fileName;

    public ExistedFile(String fileName){
        this.fileName = fileName;
    }

    public int content() throws IOException {
        FileReader inputStream = null;
        try {
            inputStream = new FileReader(fileName);
            }
        catch (Exception e){
            e.printStackTrace();
        }
         return inputStream.read();
    }

}
