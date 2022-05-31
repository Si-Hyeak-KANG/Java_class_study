package test.koplit;

import test.Array;

import java.util.*;

public class QueuePrinter {

    public static void main(String[] args) {
        int bufferSize = 2;
        int capacities = 10;
        int[] documents = new int[]{7, 4, 5, 6};

        int output = queuePrinter(bufferSize, capacities, documents);
        System.out.println(output);
    }

    // bufferSize : 인쇄 작업 목록의 크기
    // capacities : 용량
    public static int queuePrinter(int bufferSize, int capacities, int[] documents) {
        // TODO:
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<Integer>();

        for(int data : documents) {
            list.add(data);
        }
        // bufferSize만한 인쇄 대기열을 만든다.
        for(int i = 0; i < bufferSize; i++) {
            queue.add(0);
        }

        int time = 0;

        // 대기중인 문서가 있을 경우
        while(list.size() > 0) {

            int currIndex = 0;
            int nextIndex = currIndex + 1;
            int value = 0;

            queue.add(list.get(0));
            queue.poll();
            time++;

            for (Integer data : queue) {
                value += data;
            }

            if(list.size() != 1) {
                if (value + list.get(nextIndex) <= capacities) {
                    list = list.subList(nextIndex, list.size());
                } else {
                    while (true) {
                        value -= queue.peek();
                        if (value + list.get(nextIndex) <= capacities) {
                            list = list.subList(nextIndex, list.size());
                            break;
                        }
                        queue.poll();
                        queue.add(0);
                        time++;
                    }
                }
            } else {
                while(value <= 0) {
                    value -= queue.poll();
                    queue.add(0);
                    time++;
                }
            }
        }

        return time;
    }
}
