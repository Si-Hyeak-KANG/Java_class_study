package effective.inputoutput;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {

        try {
            String fileName = "codestates2.txt";
            FileReader file = new FileReader(fileName);
            //FileInputStream file = new FileInputStream(fileName);
            BufferedReader buffered = new BufferedReader(file);

            int data = 0;

            while((data = buffered.read()) != -1) {
                System.out.println((char)data);
            }
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
