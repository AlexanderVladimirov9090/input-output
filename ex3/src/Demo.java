import java.io.*;

/**
 * Created by clouway on 19.05.16.
 */
public class Demo {

    public static void main(String[] args) {

            TextFile file = new TextFile();

        try {
           file.reverse("file");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}



