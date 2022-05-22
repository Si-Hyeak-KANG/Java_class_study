package effective.collection;

public class GenericTest2 {

    public static void main(String[] args) {

        Test<Integer, String> test = new Test<>(1,"사람");


        test.print();
    }
}
