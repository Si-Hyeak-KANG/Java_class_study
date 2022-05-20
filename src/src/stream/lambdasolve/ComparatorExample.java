package stream.lambdasolve;

import java.util.Arrays;
import java.util.stream.Stream;

public class ComparatorExample {
    public static void main(String[] args) {
        Stream<String[]> stringArrayStream = Stream.of(
                                                new String[]{"hello","world","java"},
                                                new String[]{"code","states"});

        //stringArrayStream.flatMap(Arrays::stream).forEach(System.out::println);

        stringArrayStream.map(Arrays::stream)
                            .forEach(System.out::println);
    }
}
