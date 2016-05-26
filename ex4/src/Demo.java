import java.io.*;

/**
 * Created by clouway on 26.05.16.
 */
public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream source = new FileInputStream("file");
            FileOutputStream destination = new FileOutputStream("Destination");

            TransferObject transferObject = new TransferObject();
            transferObject.transfer(source,destination,13,14);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
