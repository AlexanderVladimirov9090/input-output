import java.io.File;
import java.io.IOException;

/**
 * Created by clouway on 30.05.16.
 */
public class Demo {
  public static void main(String[] args) throws IOException {

    DirectoryBrowser browser = new DirectoryBrowser();
    Checkpoint checker = new Checkpoint();

    for (File file : browser.listContent("/home/clouway/developmnet/input-output")) {
      System.out.println(checker.checkIfDirOrFile(file.getName()));
    }

    System.out.println();

    for (File file : browser.listContent("/home/clouway/developmnet/input-output/file")) {
      System.out.println(checker.checkIfDirOrFile(file.getName()));
    }
  }
}