import javax.imageio.IIOException;
import java.io.*;

/**
 * Created by clouway on 20.05.16.
 */
public class ReversedFile {

    /**
     * Transfer reversed lines from file to file.
     * @param sourceFile is the file from the reading is.
     * @param destinationFile is the file where writing is.
     */
    public void contentFileToFile(String sourceFile, String destinationFile) {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader(sourceFile));
            outputStream = new PrintWriter(new FileWriter(destinationFile));

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

    /**
     * Reversing giver string.
     * @param line line that is reversed
     * @return reversed line.
     */
    private String reverse(String line) {
        String reversedString = "";

        for (int i = line.length(); i > 0; i--) {
            reversedString += line.charAt(i - 1);
        }
        return reversedString;
    }
}

