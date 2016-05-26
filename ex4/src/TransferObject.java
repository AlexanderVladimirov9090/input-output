import java.io.*;

/**
 * Created by clouway on 26.05.16.
 */
public class TransferObject {
    private FileInputStream source;

    public TransferObject(FileInputStream source) {
        this.source = source;
    }

    /**
     * Transfer fragment of file to another file.
     * @param destination file that content is written to.
     * @param buffer used to buffer content.
     * @param offset starting position of write
     * @param length how much content to be written.
     */
    public void transferFragmentTo(FileOutputStream destination, byte[] buffer, int offset, int length) {

        try {
            while ((source.read(buffer)) != -1) {
                destination.write(buffer, offset, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (source != null) {
                try {
                    source.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (destination != null) {
                try {
                    destination.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
