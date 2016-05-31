import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

import static java.nio.file.Files.isDirectory;

/**
 * Created by clouway on 30.05.16.
 */
public class DirectoryBrowser {

  /**
   * Adding content of an dir to file array and return array.
   * String source file phat.
   *
   * @return array of files.
   */
  public File[] listContent(String source) {

    File file = new File(source);

    if (file.isDirectory()) {
      return file.listFiles();
    } else {
      File[] oneFile = {file};
      return oneFile;
    }
  }
}