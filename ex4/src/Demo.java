import java.io.*;

/**
 * Created by clouway on 26.05.16.
 */
public class Demo {
    public static void main(String[] args) {
        try {
            FileInputStream source = new FileInputStream("file");
            FileOutputStream destination = new FileOutputStream("Destination");
            TransferObject transferObject = new TransferObject(source);
            transferObject.transferFragmentTo(destination, new byte[1024], 10 ,3);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
