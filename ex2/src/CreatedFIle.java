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


    public void createFile() {
        if (file == null) {
            File directory = new File("/src");
            file = new File(directory, nameOfFile);
        }
        write();
    }

    private String read(String endFileSymbol) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        boolean check = true;
        while (check) {
            String buf = sc.nextLine();
            if (buf.equals(endFileSymbol)) {
                check = false;
            } else {
                str += buf + "\n";
            }
        }
        return str;
    }

    private void write() {
        try (FileWriter writer = new FileWriter(nameOfFile)) {
            writer.write(read(endFileSymbol));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
