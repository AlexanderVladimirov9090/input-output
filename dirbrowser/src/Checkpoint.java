import java.io.File;

/**
 * Created by clouway on 31.05.16.
 */
public class Checkpoint {

  /**
   * Checks if dir or file and returns an answer.
   *
   * @param source Path of file.
   * @return String that says file is dir or file.
   */
  public String checkIfDirOrFile(String source) {

    File file = new File(source);

    if (file.isDirectory()) {
      return "Dir: " + file.getName();
    } else {
      return "File: " + file.getName();
    }
  }
}