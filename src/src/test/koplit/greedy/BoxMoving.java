package test.koplit.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxMoving {

    public static void main(String[] args) {
        int output = movingStuff(new int[]{70, 50, 80, 50}, 100);
        System.out.println(output); // 3

        int output2 = movingStuff(new int[]{60, 80, 120, 90, 130}, 140);
        System.out.println(output2); // 4

        int output3 = movingStuff(new int[]{42, 25, 60, 73, 103, 167}, 187);
        System.out.println(output3);

        int output4 = movingStuff(new int[]{60, 73, 80, 87,  103, 109, 119, 123, 128, 129, 136, 146, 153, 168, 182}, 200);
        System.out.println(output4); //11


    }

    public static int movingStuff(int[] stuff, int limit) {
        // TODO:

        int standard = limit / 2;
        int index = 0;
        int count = 0;
        Arrays.sort(stuff);

        for (int i = 0; i < stuff.length; i++) {

            if (stuff[i] > standard) {
                index = i;
                break;
            }
        }

        List<Integer> newStuff = new ArrayList<>();

        for (int data : stuff) {
            newStuff.add(data);
        }

        List<Integer> left = newStuff.subList(0, index);
        List<Integer> right = newStuff.subList(index, newStuff.size());

        for (int i = 0; i < right.size(); i++) {

            for (int j = index - i - 1; j >= 0; j--) {

                if (left.get(j) + right.get(i) <= limit) {
                    count++;
                    break;
                }
            }
        }

        double result = (double)(left.size() - count)/2;

        if (count == 0 || left.size()-count != 0) {
            count = (int) (Math.ceil(result) + right.size());
        } else {
            count = right.size();
        }

        return count;

    }
}
