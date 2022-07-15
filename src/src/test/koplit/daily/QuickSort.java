package test.koplit.daily;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] output = quickSort(new int[]{3, 1, 21, 4 ,7 , 2});
        for (int i : output) {
            System.out.println(i);
        }

    }

    public static int[] quickSort(int[] unSortedArray) {

        if(unSortedArray.length <= 1) {
            return unSortedArray;
        }

        int midIdx = unSortedArray.length / 2;

        int[] left = quickSort(Arrays.copyOf(unSortedArray,midIdx));
        int[] right = quickSort(Arrays.copyOfRange(unSortedArray,midIdx,unSortedArray.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {

        int[] sortedArray = new int[left.length + right.length];

        int leftIdx = 0;
        int rightIdx = 0;
        int currIdx = 0;

        while(left.length > leftIdx && right.length > rightIdx) {

            if(left[leftIdx] < right[rightIdx]) {
                sortedArray[currIdx] = left[leftIdx];
                currIdx++;
                leftIdx++;
            } else {
                sortedArray[currIdx] = right[rightIdx];
                currIdx++;
                rightIdx++;
            }
        }

        while(currIdx < sortedArray.length) {
            if (right.length == rightIdx) {
                sortedArray[currIdx] = left[leftIdx];
                currIdx++;
                leftIdx++;
            } else if (left.length == leftIdx) {
                sortedArray[currIdx] = right[rightIdx];
                currIdx++;
                rightIdx++;
            }
        }
        return sortedArray;
    }
}
