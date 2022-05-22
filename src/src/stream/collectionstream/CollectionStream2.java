package stream.collectionstream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class CollectionStream2 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        // 한 라인씩 읽으면서 처리
        Stream<String> lines = Files.lines(Path.of("C:/Users/kang/Desktop/temptest/data.txt"));

        lines.forEach(line -> {});

        long end = System.currentTimeMillis();

        System.out.println("# 작업 시간 : " + (end - start)); // 334
    }
}
