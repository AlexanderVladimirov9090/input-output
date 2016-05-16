import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by clouway on 16.05.16.
 */

/**
 * Implements Reading interface
 */
public class ConsoleReader implements Reading {
    private BufferedReader reader;

    public ConsoleReader(InputStreamReader inStream) {
        this.reader = new BufferedReader(inStream);
    }

    /**
     * Reads String type of input
     *
     * @return
     */
    @Override
    public String readString() {
        String inputString = "";

        try {
            inputString = readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputString;
    }

    /**
     * Reads char type of input
     *
     * @return
     */
    @Override
    public char readChar() {
        char c = 0;

        try {
            char inputString = readLine().charAt(0);
            c = inputString;
        } catch (IOException e) {
            e.printStackTrace();
        }
          return c;
    }

    /**
     * Reads int type of input
     *
     * @return
     */
    @Override
    public int readInt() {
        String inputString = null;

        try {
            inputString = readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int n = Integer.parseInt(inputString);
        return n;
    }

    /**
     * Reads float type of inpute
     *
     * @return
     */
    @Override
    public float readFloat() {
        String inputString = null;

        try {
            inputString = readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        float f = Float.parseFloat(inputString);
        return f;
    }

    /**
     * Reads String and throws IOException
     *
     * @return
     * @throws IOException
     */
    public String readLine() throws IOException {
        String inputLine = "";

        try {
            inputLine = reader.readLine();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        return inputLine;
    }
}
