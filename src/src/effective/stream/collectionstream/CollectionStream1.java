package effective.stream.collectionstream;

import java.util.List;
import java.util.stream.Stream;

public class CollectionStream1 {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = List.of(1,2,3,4,5);

        System.out.println(list);

        Stream<Integer> stream = Stream.of(1,2,3,4,5)
                .filter(n-> n > 2);

        System.out.println("# not processed stream");
        Thread.sleep(5000L);
        System.out.println("# invoke terminal operation");
        stream.forEach(System.out::println);
        // 위 모든 stream 과정이 최종 연산을 호출해야 그때서야 작업
        // -> lazy evaluation
    }
}