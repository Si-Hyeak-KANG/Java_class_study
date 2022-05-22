package effective.thread;

public class Task2 {

    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            // 스레드가 실행할 코드
        }
    });

    Thread thread2 = new Thread(() -> {
       // 스레드가 실행할 코드
    });
}
