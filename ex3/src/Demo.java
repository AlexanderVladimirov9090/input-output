import java.io.File;

/**
 * Created by clouway on 19.05.16.
 */
public class Demo {

    public static void main(String[] args) {
        Content content = new Content("file");
        File target = new File("ReversedFile");
        content.writeReversed(target);
    }
}