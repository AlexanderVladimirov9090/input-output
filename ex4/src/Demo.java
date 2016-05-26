import java.io.*;

/**
 * Created by clouway on 26.05.16.
 */
public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream source = new FileInputStream("file");
            FileOutputStream destination = new FileOutputStream("Destination");
            TransferObject transObject = new TransferObject();
            System.out.println(transObject.transfer(source, destination, 2, 4));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
