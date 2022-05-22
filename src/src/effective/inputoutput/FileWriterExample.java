package effective.inputoutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {

        try {
            String fileName = "codestates2.txt";
            FileWriter writer = new FileWriter(fileName);

            String str = "안녕 written!";
            writer.write(str);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
