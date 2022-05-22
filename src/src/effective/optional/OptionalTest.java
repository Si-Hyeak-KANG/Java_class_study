package effective.optional;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> opt1 = Optional.ofNullable(null);
        Optional<String> opt2 = Optional.ofNullable("123");

        System.out.println(opt1);
        // Optional 객체의 값이 null인지 여부 리턴
        System.out.println(opt1.isPresent()); // false

        System.out.println(opt2);
        System.out.println(opt2.isPresent()); // true

        // Optional 타입의 참조변수를 기본값으로 초기화
        Optional<String> opt3 = Optional.<String>empty();
        System.out.println(opt3);
        System.out.println(opt3.isPresent());
        System.out.println(opt3.isEmpty());

        Optional<String> opt4 = Optional.of("codestates");
        System.out.println(opt4);
        System.out.println(opt4.get());

        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("kimcoding");
        System.out.println(name);
    }



}
