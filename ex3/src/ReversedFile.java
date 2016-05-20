import javax.imageio.IIOException;
import java.io.*;

/**
 * Created by clouway on 20.05.16.
 */
public class ReversedFile {


    public void contentFileToFile(String sourceFile, String newFile) {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader(sourceFile));
            outputStream = new PrintWriter(new FileWriter(newFile));

            String l;

            while ((l = inputStream.readLine()) != null)
                outputStream.println(new StringBuffer(l).reverse());
        } catch (IIOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (inputStream != null) {

                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}

