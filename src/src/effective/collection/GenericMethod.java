package effective.collection;


class TestClass {

    public <T> T accept(T t) {
        return t;
    }

    public <K, V> void getPrint(K k, V v) { // 리턴 타입 앞에 타입 매개변수 선언
        System.out.println(k + ":" + v);
    }
}

public class GenericMethod {
    public static void main(String[] args) {

        TestClass testClass = new TestClass();

        String str1 = testClass.<String>accept("Kim coding");
        String str2 = testClass.accept("Kim Coding"); // 입력 매개변수 값으로 제네릭 타입을 유추 가능하면 제네릭 타입 지정을 생략 가능

        System.out.println(str1);
        System.out.println(str2);

        testClass.<String, Integer> getPrint("Kim Coding", 1);
        testClass.getPrint("Kim Coding" , 2);
    }
}

