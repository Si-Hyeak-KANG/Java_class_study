package base.array;

import java.util.Arrays;

public class SystemArray {

    public static void main(String[] args) {

        int[] srcArr = {1,2,3,4,5};
        int[] destArr = new int[6];

        System.arraycopy(srcArr, 0 , destArr, 3,4);

        System.out.println(Arrays.toString(destArr));

    }
}
