/**
 * Created by clouway on 30.05.16.
 */
public class Demo {
  public static void main(String[] args) {
    DirectoryBrowser browser = new DirectoryBrowser();

    System.out.println(browser.listContent("/home/clouway/developmnet/path/WorkingPath"));

    System.out.println(browser.listContent("/home/clouway/developmnet/path/WorkingPath/file.txt"));

    }
}
