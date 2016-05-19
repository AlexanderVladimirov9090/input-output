import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by clouway on 19.05.16.
 */
public class WrittenFile {
    private PrintWriter outputStream;
    private String fileName;
    public WrittenFile(String fileName){
        this.fileName = fileName;
    }

    public void copyContentFrom(ExistedFile file) throws IOException {

        try{
        outputStream = new PrintWriter(new FileWriter(fileName));

            while ( file.content() !=null){
                outputStream.println(file.content());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            outputStream.close();
        }
    }
}
