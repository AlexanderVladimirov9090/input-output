import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * Created by clouway on 16.05.16.
 */
public class Demo {
    public static void main(String[] args) {
        ConsoleStream reader = new ConsoleStream(System.in);

        try {
            System.out.println("OK");
            System.out.println("Hello "+ reader.readInt());
           /* System.out.println(reader.readChar());
            System.out.println(reader.readFloat());
            System.out.println(reader.readString());
       */
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
}

