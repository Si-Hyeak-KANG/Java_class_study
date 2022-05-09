package array;

import java.util.Arrays;

public class SystemArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] arr2 = {2,2,2,2,2};

        System.arraycopy(arr, 0 , arr2, 0,5);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}
