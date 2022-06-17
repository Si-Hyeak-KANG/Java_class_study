package test.koplit.daily;

import java.util.ArrayList;

/**
 * 동적 계획법 활용
 */
public class ComputeSquareRoot {

    public static void main(String[] args) {

        String output = computeSquareRoot(2);
        System.out.println(output); // --> "1.41"

        output = computeSquareRoot(9);
        System.out.println(output); // --> "3.00"

        output = computeSquareRoot(6);
        System.out.println(output);

        output = computeSquareRoot(144);
        System.out.println(output);
    }

    public static String computeSquareRoot(int num) {
        // TODO:
        double[] arr = new double[num+1];
        arr[0] = 1;
        double total = 0;

        for(int i = 1; i < arr.length; i++) {

            arr[i] = (arr[i-1] + num / arr[i-1]) / 2;
        }

        String result = String.format("%.2f", arr[arr.length - 1]);
        return result;
    }

    // reference
    public static String referSquareRoot(int num) {

        // 소수점 3자리부터 반올림하기 때문에, 배열에 소수점 자리만큼 선언
        double[] diffs = new double[]{1, 0.1, 0.01, 0.001};

        double base = 1;

        for(int i = 0; i < diffs.length; i++) {

            while(base * base < num) {
                base += diffs[i];
            }

            if(base * base == num) {
                return String.format("%.2f",base);
            } else {
                base -= diffs[i];
            }
        }

        return String.format("%.2f",base);
    }
}
