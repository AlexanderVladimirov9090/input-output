import java.io.*;

/**
 * Created by clouway on 26.05.16.
 */
public class TransferObject {

    /**
     * Transfer fragment of file to another file.
     * @param destination file that content is written to.
     * @param offset      starting position of write
     * @param length      how much content to be written.
     */
    public int transfer(InputStream source, OutputStream destination, int offset, int length) {
        int nextByte;
        int counter = 0;
        try {

            source.skip(offset);

            while ((nextByte = source.read()) != -1) {

                destination.write(nextByte);
                counter++;
                if (counter == length) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return counter;
    }
}