package effective.thread;

public class Task implements Runnable {
    @Override
    public void run() {

        Runnable task = new Task();

        Thread thread = new Thread(task); // 작업 스레드 생성
    }
}

// Thread thread = new Task();
