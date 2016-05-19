import java.util.Scanner;

/**
 * Created by clouway on 19.05.16.
 */
public class Console {
    /**
     * Reads input from keyboard.
     * @param endFileSymbol the symbol that is used to end input session.
     * @return String content.
     */
    public String contentTill(String endFileSymbol) {
        Scanner scanner = new Scanner(System.in);
        String content = "";
        boolean check = true;

        while (check) {
            String buffer = scanner.nextLine();

            if (buffer.equals(endFileSymbol)) {
                check = false;
            } else {
                content += buffer + "\n";
            }
        }
        return content;
    }
}
