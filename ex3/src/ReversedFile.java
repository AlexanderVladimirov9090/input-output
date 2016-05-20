import javax.imageio.IIOException;
import java.io.*;

/**
 * Created by clouway on 20.05.16.
 */
public class ReversedFile {


    public void contentFileToFile(String fileName, String newFile) {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader(fileName));
            outputStream = new PrintWriter(new FileWriter(newFile));

            String l;

            while ((l = inputStream.readLine()) != null)
                outputStream.println(reverse(l));
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

    private String reverse(String line) {
        String reversedString = "";

        for (int i = line.length(); i > 0; i--) {
            reversedString += line.charAt(i - 1);
        }
        return reversedString;
    }
}

