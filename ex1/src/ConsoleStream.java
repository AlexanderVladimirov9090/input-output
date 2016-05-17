import java.io.*;

/**
 * Created by clouway on 16.05.16.
 */

/**
 * Implements Reading interface
 */
public class ConsoleStream{
    private InputStream stream;

    public  ConsoleStream(InputStream inputStream){
        stream = inputStream;    }



    /**
     * Reads String type of input
     *
     * @return
     */
        public String readString() {


         String   inputString = stringFromInputStream();
                return inputString;
    }

    /**
     * Reads char type of input
     *
     * @return
     */

    public char readChar() {

            char c = stringFromInputStream().charAt(0);


          return c;
    }

    /**
     * Reads int type of input
     *
     * @return
     */
        public int readInt() {

        int n = Integer.parseInt(stringFromInputStream());

        return n;
    }

    /**
     * Reads float type of inpute
     *
     * @return
     */
        public float readFloat() {

        float f = Float.parseFloat(stringFromInputStream());
        return f;
    }


   private String   stringFromInputStream(){
       BufferedReader br = null;
       StringBuilder sb = new StringBuilder();
       String line;
       try{
           br = new BufferedReader(new InputStreamReader(stream));
           while ((line = br.readLine()) !=null);
           sb.append(line);
       }catch (IOException e){
           e.fillInStackTrace();
       }
       finally {
           if (br != null){
               try {
                   br.close();
               }catch (IOException e){
                   e.fillInStackTrace();
               }
           }
       }
       return sb.toString();
   }

}
