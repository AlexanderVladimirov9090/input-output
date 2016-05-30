import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Files.isDirectory;

/**
 * Created by clouway on 30.05.16.
 */
public class DirectoryBrowser {

  public String listContent(String source) {
    Path filePat = Paths.get(source);
    String isFile="Is file:\n";
    if (isDirectory(filePat)) {
       try (DirectoryStream<Path> stream = Files.newDirectoryStream(filePat)) {
      String contentOfDri="Is Directory:";
        for (Path file : stream) {
          contentOfDri += file.getFileName();
          contentOfDri +="\n";
        }
         return contentOfDri;
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return isFile + String.valueOf(filePat.getFileName());
  }
}
