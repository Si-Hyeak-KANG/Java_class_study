package test.koplit.daily;

import java.util.Arrays;

public class ReversArr {

    public static void main(String[] args) {
        int[] output = reverseArr(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(output));
    }

    public static int[] reverseArr(int[] arr){
        // TODO:

        if(arr.length == 1) {
            return arr;
        }

        int midIdx = arr.length / 2;
        int count =0;
        System.out.println(count++);

        int[] left = Arrays.copyOf(arr, midIdx);
        left = reverseArr(left);
        int[] right = Arrays.copyOfRange(arr, midIdx, arr.length);
        right = reverseArr(right);

        return splitMerge(left,right);
    }

    public static int[] splitMerge(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];

        System.arraycopy(right,0,result,0,right.length);
        System.arraycopy(left,0,result,right.length,left.length);

        return result;

    }

}
