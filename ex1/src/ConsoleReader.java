import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by clouway on 16.05.16.
 */
public class ConsoleReader implements Reading {

    public ConsoleReader(BufferedReader inStream) {
        BufferedReader reader = new BufferedReader(inStream);
    }

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


    @Override
    public char readChar() {

        try {
            String inputString = readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        char c = readChar();
        return c;


    }

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

    private BufferedReader reader;
}
