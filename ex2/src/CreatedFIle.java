import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by clouway on 18.05.16.
 */
public class CreatedFIle {
    private File file;
    private String nameOfFile;
    private String endFileSymbol;

    public CreatedFIle(String nameOfFile, String endFileSymbol) {

        this.nameOfFile = nameOfFile;
        this.endFileSymbol = endFileSymbol;
    }

    /**
     * Creating file and calling write() to write given content.
     */
    public void createFile() {

        if (file == null) {
            File directory = new File("/src");
            file = new File(directory, nameOfFile);
        }
        write();
    }

    /**
     * Reads content from console.
     *
     * @param endFileSymbol symbol used by user to stop read from console.
     * @return content from console.
     */
    private String read(String endFileSymbol) {
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
     * Write content form read() to file.
     */
    private void write() {

        try (FileWriter writer = new FileWriter(nameOfFile)) {
            writer.write(read(endFileSymbol));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
