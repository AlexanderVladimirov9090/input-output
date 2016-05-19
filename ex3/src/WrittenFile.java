import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by clouway on 19.05.16.
 */
public class WrittenFile {
    private String fileName;
    private ExistedFile file;
    public WrittenFile(String fileName){
        this.fileName = fileName;
    }

    public void copyContentFrom(int fileC) throws IOException {
        FileWriter outputStream= null;

        try{
            int c;
            while ((c = file.content()) !=-1){
                outputStream.write(c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
