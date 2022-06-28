package test.koplit.daily;

import java.util.Arrays;

public class LargestProductOfThree {

    public static void main(String[] args) {
        int output = largestProductOfThree(new int[]{2, 1, 3, 7});
        System.out.println(output); // --> 42 (= 2 * 3 * 7)

        output = largestProductOfThree(new int[]{-1, 2, -5, 7});
        System.out.println(output); // --> 35 (= -1 * -5 * 7)
    }

    public static int largestProductOfThree(int[] arr) {
        // TODO:
        Arrays.sort(arr);

        int lastIndex = arr.length - 1;
        int firstValue = arr[lastIndex] + arr[lastIndex - 1] + arr[lastIndex - 2]; // 세 개의 양수의 곱
        int secondValue = arr[lastIndex] + arr[0] + arr[1]; // 최대값 * 가장 작은 음수 두개

        return Math.max(firstValue, secondValue);
    }
}
