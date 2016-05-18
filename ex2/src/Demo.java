/**
 * Created by clouway on 18.05.16.
 */
public class Demo {
    public static void main(String[] args) {

        TextFile file = new TextFile("file");
        System.out.println("Enter content for file, then type . to finish:");
        file.createFile(".");
    }
}

