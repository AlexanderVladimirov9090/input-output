import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.nio.file.Files.isDirectory;

/**
 * Created by clouway on 30.05.16.
 */
public class DirectoryBrowser {

    /**
     * Returns string of file name if dir returns content of dir.
     *
     * @param source file path.
     * @return string of file name.
     */
    public List<String> listContent(String source) {
        Path filePath = Paths.get(source);
        List<String> files = new LinkedList<>();
        if (isDirectory(filePath)) {
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(filePath)) {
                String dirString = "Is Directory:";
                files.add(dirString);
                for (Path file : stream) {
                    files.add(String.valueOf(file.getFileName()));
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            String fileString = "Is file";
            files.add(fileString);
            files.add(String.valueOf(filePath.getFileName()));
        }
        return files;
    }
}
