package lambda;

public class Test {
    public static void main(String[] args) {

        // 인터페이스의 익명 구현 객체 생성
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
            }
        };

        Runnable runnable1 = () -> {};
    }
}
