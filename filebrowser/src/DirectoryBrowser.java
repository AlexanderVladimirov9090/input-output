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

  public void listContent(String source) {
    Path filePat= Paths.get(source);
    if (isDirectory(filePat)) {
      System.out.println(filePat.getFileName()+" = Directory.");
      try (DirectoryStream<Path> stream = Files.newDirectoryStream(filePat)){
        for (Path file : stream) {
          System.out.println(file.getFileName());
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    } else {
      System.out.println(filePat.getFileName()+" = File.");
    }
  }
}
