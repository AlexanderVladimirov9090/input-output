import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by clouway on 19.05.16.
 */
public class ExistedFile {
    private String fileName;

    public ExistedFile(String fileName) {
        this.fileName = fileName;
    }

    public String content() throws IOException {
        BufferedReader inputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader(fileName));

            return inputStream.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            inputStream.close();
                    }
        return "";

    }
}
