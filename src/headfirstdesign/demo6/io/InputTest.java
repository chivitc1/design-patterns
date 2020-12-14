package demo6.io;

import java.io.*;
import java.nio.file.Path;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
//            System.out.println(Path.of(".").toAbsolutePath());
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("test.txt")
                    )
            );
            while ((c = in.read()) > 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
