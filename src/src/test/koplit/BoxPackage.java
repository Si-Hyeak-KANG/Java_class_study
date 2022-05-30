package test.koplit;

import java.util.*;

public class BoxPackage {

    public static void main(String[] args) {
        Integer[] boxes2 = new Integer[]{5, 1, 4, 6, 2, 3, 5, 6, 7};
        int output2 = paveBox(boxes2);
        System.out.println(output2); // 6
    }

    public static int paveBox(Integer[] boxes) {
        Integer start = boxes[0]; // 5
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        for (int data : boxes) {
            queue.add(data); //
        }

        for (int i = 0; i < boxes.length; i++) {

            int n = queue.poll();

            if (n > start) {
                list.add(count);
                count = 0;
                start = boxes[i];
            }

            count++;

            if (i == boxes.length - 1) {
                list.add(count);
            }
        }
        // 5 1 4 6 5 3 5 -> 3

        return list.stream().max(Integer::compare).orElse(-1);
    }
}
