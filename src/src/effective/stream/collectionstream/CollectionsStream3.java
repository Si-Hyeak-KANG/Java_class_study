package effective.stream.collectionstream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class CollectionsStream3 {
    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        Stream<String> lines = Files.lines(Path.of("C:/Users/kang/Desktop/temptest/data.txt"));

        lines.limit(10) // Short-circuit : 필요한 데이터만 읽고 데이터 스트림을 끓는다.
                .forEach(line -> {});

        long end = System.currentTimeMillis();

        System.out.println("# 작업 시간 : " + (end - start)); // 7
    }
}
