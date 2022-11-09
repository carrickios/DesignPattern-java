import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import IOStream.LowerCaseInputStream;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try {

            
            InputStream in = 
            new LowerCaseInputStream(
                new BufferedInputStream(
                    new FileInputStream(
                        // change FILEPATH with your own
                        new File("FILEPATH/test.txt"))));

            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
