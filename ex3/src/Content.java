import javax.imageio.IIOException;
import java.io.*;

/**
 * Created by clouway on 20.05.16.
 */
public class Content {
        private String sourceFile;

    public Content(String sourceFile){
        this.sourceFile = sourceFile;
    }

    /**
     * Transfer reversed lines from file to file.
     * @param destinationFile is the file where writing is.
     */
    public void writeReversed(File destinationFile) {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader(sourceFile));
            outputStream = new PrintWriter(new FileWriter(destinationFile));

            String line;

            while ((line = inputStream.readLine()) != null)
                outputStream.println(reverse(line));
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

