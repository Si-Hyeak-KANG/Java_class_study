package dataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        Queue<Integer> queueList = new LinkedList<>();

        queueList.add(1);
        queueList.add(2);
        queueList.add(3);
        queueList.add(4);

        queueList.poll();
        System.out.println(queueList.poll());

        queueList.add(5);

        for (Integer integer : queueList) {
            System.out.print(integer);
        }

        ArrayList<Integer> list = new ArrayList<>();

        list.size()
    }
}
