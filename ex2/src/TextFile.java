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
     * Creating file and calling write() to write given contentTill.
     */
    public void createFile() {

        if (file == null) {
            File directory = new File("/src");
            file = new File(directory, nameOfFile);
        }
    }

    public String fileName(){
        return nameOfFile;
    }
/*
    /**
     * Reads contentTill from console.
     *
     * @param endFileSymbol symbol used by user to stop contentTill from console.
     * @return contentTill from console.
     */
 /*   private String contentTill(String endFileSymbol) {
        Scanner scanner = new Scanner(System.in);
        String contentTill = "";
        boolean check = true;

        while (check) {
            String buffer = scanner.nextLine();

            if (buffer.equals(endFileSymbol)) {
                check = false;
            } else {
                contentTill += buffer + "\n";
            }
        }
        return contentTill;
    }*/
/*
    /**
     * Write contentTill form contentTill() to file.
     */
  /*  private void write(String endFileSymbol) {

        try (FileWriter writer = new FileWriter(nameOfFile)) {
            writer.write(contentTill(endFileSymbol));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    */
}
