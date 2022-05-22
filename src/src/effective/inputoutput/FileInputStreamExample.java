package effective.inputoutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FileInputStreamExample {

    public static void main(String[] args) {

        try {
            FileInputStream fileInput = new FileInputStream("codestates.txt");
            BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);

            int i = 0;

            // fileInput.read()의 리턴값을 i에 저장
            while((i = bufferedInput.read()) != -1) {
                System.out.println((char)i);
            }

            fileInput.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
