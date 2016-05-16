import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by clouway on 16.05.16.
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("Enter something here : ");
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        ConsoleReader input = new ConsoleReader(bufferRead);
        try{
            input.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }


    }

}
