package test.koplit;

import test.Array;

import java.util.*;

public class QueuePrinter {

    public static void main(String[] args) {
        int bufferSize = 4;
        int capacities = 10;
        int[] documents = new int[]{7, 4, 5, 6, 8, 3};

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
        for(int i =0; i < bufferSize; i++) {
            queue.add(0);
        }

        int time = 0;
        int i = 0;

        while(list.size() > 0) {
            int value = 0;
            int curr = documents[i];

            if(i!=0 && queue.peek() != documents[i]) {
                time++;
            }

            queue.poll();
            queue.add(curr);

            if(i==0){
                time++;
            }

            value = curr;
            int count = 1;
            if(documents.length-1 != i) {
                for (int j = i + 1; j < documents.length; j++) {
                    int next = documents[j];
                    value += next;

                    if (value > capacities) {

                        while(queue.peek()!=curr) {
                            queue.poll();
                            queue.add(0);
                            time++;
                        }
                        i++;

                        value -= queue.peek();

                        while (value > capacities) {
                            queue.poll();
                            queue.add(0);
                            time++;
                            value -= queue.peek();
                        }
                        break;

                    }
                    queue.poll();
                    queue.add(next);
                    time++;
                    i = j;
                    count++;

                }
            } else {
                while(queue.peek()!=curr) {
                    queue.poll();
                    queue.add(0);
                    time++;
                }
                queue.poll();
                queue.add(0);
                time++;
            }

            list = list.subList(count, list.size());
        }
        return time;
    }
}
+