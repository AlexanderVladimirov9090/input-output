import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by clouway on 16.05.16.
 */
public class Demo {
    public static void main(String[] args) {
        ConsoleReader reader1 = new ConsoleReader(new InputStreamReader(System.in));

        try {
            System.out.println(reader1.readLine());
            System.out.println(reader1.readInt());
            System.out.println(reader1.readChar());
            System.out.println(reader1.readFloat());
            System.out.println(reader1.readString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
