/**
 * Created by clouway on 18.05.16.
 */
public class Demo {
    public static void main(String[] args) {

        TextFile file = new TextFile("file");
        Console console = new Console();

        System.out.println("Enter contentTill for file, then type . to finish:");
        file.createFile();
        Writer writer = new Writer();
        writer.write(console.contentTill("."), file);

    }
}

