import java.io.IOException;

/**
 * Created by clouway on 19.05.16.
 */
public class Demo {

    public static void main(String[] args)
    {
            ExistedFile file = new ExistedFile("file");

            WrittenFile wFile = new WrittenFile("newFile");

         try {
             file.content();
             wFile.copyContentFrom( file);
         }catch (IOException e){
             e.printStackTrace();
         }
    }
}
