import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by clouway on 18.05.16.
 */
public class TextFile {
    private File file;
    private String nameOfFile;


    public TextFile(String nameOfFile) {

        this.nameOfFile = nameOfFile;

    }

    /**
     * Creating file and calling write() to write given content.
     */
    public void createFile(String endFileSymbol) {

        if (file == null) {
            File directory = new File("/src");
            file = new File(directory, nameOfFile);
        }
        write(endFileSymbol);
    }

    /**
     * Reads content from console.
     *
     * @param endFileSymbol symbol used by user to stop content from console.
     * @return content from console.
     */
    private String content(String endFileSymbol) {
        Scanner scanner = new Scanner(System.in);
        String content = "";
        boolean check = true;

        while (check) {
            String buffer = scanner.nextLine();

            if (buffer.equals(endFileSymbol)) {
                check = false;
            } else {
                content += buffer + "\n";
            }
        }
        return content;
    }

    /**
     * Write content form content() to file.
     */
    private void write(String endFileSymbol) {

        try (FileWriter writer = new FileWriter(nameOfFile)) {
            writer.write(content(endFileSymbol));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
