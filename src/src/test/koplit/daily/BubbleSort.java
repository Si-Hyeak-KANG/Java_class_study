package test.koplit.daily;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BubbleSort {

    public static void main(String[] args) {

        int[] output = bubbleSort(new int[]{2, 1, 4, 5, 3, 8, 6, 7});
        for (int i : output) {
            System.out.print(i+" ");
        }
    }

    public static int[] bubbleSort(int[] arr) {


        for (int i = 0; i < arr.length; i++) {

            int currentIndex = 0;
            boolean swap = false;

            for (int j = 1; j < arr.length-i; j++) {

                if(arr[currentIndex] > arr[j]) {

                    int temp = arr[j];
                    arr[j] = arr[currentIndex];
                    arr[currentIndex] = temp;
                    swap = true;

                }
                currentIndex++;
            }
        }
        return arr;
    }
}
