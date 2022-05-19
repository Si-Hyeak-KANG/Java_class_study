package lambda;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {

        MyFunctionalInterface example;

        // void accept() 구현
        example = () -> {
            String str = "Calling Method, First";
            System.out.println(str);
        };

        example.accept();

        // 실행문이 하나라면 중괄호 생략 가능
        example = () -> System.out.println("Calling Method, Second");

        example.accept();

        MyFunctionalInterface2 exam2;

        exam2 = (x) -> {
            int result = x * 2;
            System.out.println(result);
        };

        exam2.accept(2);

        exam2 = x -> System.out.println(x * 5);

        exam2.accept(5);

        MyFunctionalInterface3 exam3;

        exam3 = (x,y) -> {
            int result = x + y;
            return result;
        };

        exam3.accept(2,5);

        exam3 = (x,y) -> x+y;

        exam3.accept(3,7);

        exam3 = (x,y) -> sum(x,y);
        System.out.println(exam3.accept(3,5));

        exam3 = Math::max;

    }

    public static int sum(int x, int y) {
        return x+y;
    }
}
