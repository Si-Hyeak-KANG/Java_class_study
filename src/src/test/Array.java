package test;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {

    public String[] getAllWords(String str) {
        // TODO:

        String[] arr = {" "};

        if(str.equals(null)){
            arr = str.split(" ");
        }
        return arr;
    }

    public char[] getAllLetters(String str) {
        // TODO:

        ArrayList<Integer> vv = new ArrayList<>();



        char[] arr = new char[]{};

        if(!str.isEmpty()) {
            for(int i = 0; i < str.length(); i++) {

                arr[i] = str.charAt(i);

            }

        }

        return arr;

    }

    public int[] addToFront(int[] arr, int el) {
        // TODO:

        int[] resultArr = new int[arr.length+1];

        resultArr[0] = el;

        System.arraycopy(arr,0,resultArr,1,arr.length);

        return resultArr;
    }

    public int[] addToBack(int[] arr, int el) {

        int[] arr2 = new int[arr.length+1];
        arr2[2] = el;

        System.arraycopy(arr2,0,arr,0,arr2.length);

        return arr;
    }

    public int[] getAllElementsButNth(int[] arr, int n) {
        // TODO:

        if(arr.length - n < 0) {
            return arr;
        }

        if(arr.length == 0) {
            return new int[]{};
        }

        int[] result = new int[arr.length-1];

        for(int i = 0; i < arr.length-1; i++) {

            int index = 0;

            if(index == n) {
                i--;
            } else {
                result[i] = arr[index];
            }

            index++;
        }

        return result;

    }
    public String createPhoneNumber(int[] arr) {
        // TODO:

        String result = "";

        for(int i = 0; i < arr.length; i++) {

            if(arr.length == 8) {
                result = "010";
            }

            result += arr[i];
        }
        
        result.replace(,"(");

        return result;


    }

    public static void main(String[] args) {


        Array test = new Array();

        System.out.println(Arrays.toString(test.getAllElementsButNth(new int[]{1,2,3},1)));
    }
}
