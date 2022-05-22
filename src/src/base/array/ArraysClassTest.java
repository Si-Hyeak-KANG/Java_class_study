package base.array;

import java.util.Arrays;

public class ArraysClassTest {

    public static void main(String[] args) {

        int[] arr = new int[]{1,5,2,4,8};

        Arrays.fill(arr,1,4,7);

        System.out.println(Arrays.toString(arr)); // [1, 7, 7, 7, 8]
    }
}
